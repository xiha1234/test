package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.SystemintroEntity;
import com.entity.view.SystemintroView;
import com.service.SystemintroService;
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
 * 关于我们
 * 后端接口
 */
@RestController
@RequestMapping("/systemintro")
public class SystemintroController {
    @Autowired
    private SystemintroService systemintroService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, SystemintroEntity systemintro,
                  HttpServletRequest request) {
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();

        PageUtils page = systemintroService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, systemintro), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, SystemintroEntity systemintro,
                  HttpServletRequest request) {
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();

        PageUtils page = systemintroService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, systemintro), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(SystemintroEntity systemintro) {
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();
        ew.allEq(MPUtil.allEQMapPre(systemintro, "systemintro"));
        return R.ok().put("data", systemintroService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SystemintroEntity systemintro) {
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();
        ew.allEq(MPUtil.allEQMapPre(systemintro, "systemintro"));
        SystemintroView systemintroView = systemintroService.selectView(ew);
        return R.ok("查询关于我们成功").put("data", systemintroView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SystemintroEntity systemintro = systemintroService.selectById(id);
        return R.ok().put("data", systemintro);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        SystemintroEntity systemintro = systemintroService.selectById(id);
        return R.ok().put("data", systemintro);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SystemintroEntity systemintro, HttpServletRequest request) {
        systemintro.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(systemintro);
        systemintroService.insert(systemintro);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SystemintroEntity systemintro, HttpServletRequest request) {
        systemintro.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(systemintro);
        systemintroService.insert(systemintro);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SystemintroEntity systemintro, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(systemintro);
        systemintroService.updateById(systemintro);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        systemintroService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
