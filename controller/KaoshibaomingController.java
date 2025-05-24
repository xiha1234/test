package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.KaoshibaomingEntity;
import com.entity.view.KaoshibaomingView;
import com.service.KaoshibaomingService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 考试报名
 * 后端接口
 */
@RestController
@RequestMapping("/kaoshibaoming")
public class KaoshibaomingController {
    @Autowired
    private KaoshibaomingService kaoshibaomingService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, KaoshibaomingEntity kaoshibaoming,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("xuesheng")) {
            kaoshibaoming.setXuehao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();

        PageUtils page = kaoshibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshibaoming), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, KaoshibaomingEntity kaoshibaoming,
                  HttpServletRequest request) {
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();

        PageUtils page = kaoshibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshibaoming), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(KaoshibaomingEntity kaoshibaoming) {
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();
        ew.allEq(MPUtil.allEQMapPre(kaoshibaoming, "kaoshibaoming"));
        return R.ok().put("data", kaoshibaomingService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshibaomingEntity kaoshibaoming) {
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();
        ew.allEq(MPUtil.allEQMapPre(kaoshibaoming, "kaoshibaoming"));
        KaoshibaomingView kaoshibaomingView = kaoshibaomingService.selectView(ew);
        return R.ok("查询考试报名成功").put("data", kaoshibaomingView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        KaoshibaomingEntity kaoshibaoming = kaoshibaomingService.selectById(id);
        return R.ok().put("data", kaoshibaoming);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        KaoshibaomingEntity kaoshibaoming = kaoshibaomingService.selectById(id);
        return R.ok().put("data", kaoshibaoming);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request) {
        kaoshibaoming.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.insert(kaoshibaoming);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request) {
        kaoshibaoming.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.insert(kaoshibaoming);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.updateById(kaoshibaoming);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf) {
        List<KaoshibaomingEntity> list = new ArrayList<KaoshibaomingEntity>();
        for (Long id : ids) {
            KaoshibaomingEntity kaoshibaoming = kaoshibaomingService.selectById(id);
            kaoshibaoming.setSfsh(sfsh);
            kaoshibaoming.setShhf(shhf);
            list.add(kaoshibaoming);
        }
        kaoshibaomingService.updateBatchById(list);
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        kaoshibaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}