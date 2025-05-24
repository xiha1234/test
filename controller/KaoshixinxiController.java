package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.KaoshixinxiEntity;
import com.entity.view.KaoshixinxiView;
import com.service.KaoshixinxiService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * 考试信息
 * 后端接口
 */
@RestController
@RequestMapping("/kaoshixinxi")
public class KaoshixinxiController {
    @Autowired
    private KaoshixinxiService kaoshixinxiService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, KaoshixinxiEntity kaoshixinxi,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        EntityWrapper<KaoshixinxiEntity> ew = new EntityWrapper<KaoshixinxiEntity>();

        PageUtils page = kaoshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshixinxi), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, KaoshixinxiEntity kaoshixinxi,
                  HttpServletRequest request) {
        EntityWrapper<KaoshixinxiEntity> ew = new EntityWrapper<KaoshixinxiEntity>();

        PageUtils page = kaoshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshixinxi), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(KaoshixinxiEntity kaoshixinxi) {
        EntityWrapper<KaoshixinxiEntity> ew = new EntityWrapper<KaoshixinxiEntity>();
        ew.allEq(MPUtil.allEQMapPre(kaoshixinxi, "kaoshixinxi"));
        return R.ok().put("data", kaoshixinxiService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshixinxiEntity kaoshixinxi) {
        EntityWrapper<KaoshixinxiEntity> ew = new EntityWrapper<KaoshixinxiEntity>();
        ew.allEq(MPUtil.allEQMapPre(kaoshixinxi, "kaoshixinxi"));
        KaoshixinxiView kaoshixinxiView = kaoshixinxiService.selectView(ew);
        return R.ok("查询考试信息成功").put("data", kaoshixinxiView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        KaoshixinxiEntity kaoshixinxi = kaoshixinxiService.selectById(id);
        return R.ok().put("data", kaoshixinxi);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        KaoshixinxiEntity kaoshixinxi = kaoshixinxiService.selectById(id);
        return R.ok().put("data", kaoshixinxi);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshixinxiEntity kaoshixinxi, HttpServletRequest request) {
        kaoshixinxi.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(kaoshixinxi);
        kaoshixinxiService.insert(kaoshixinxi);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshixinxiEntity kaoshixinxi, HttpServletRequest request) {
        kaoshixinxi.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(kaoshixinxi);
        kaoshixinxiService.insert(kaoshixinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoshixinxiEntity kaoshixinxi, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kaoshixinxi);
        kaoshixinxiService.updateById(kaoshixinxi);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        kaoshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
