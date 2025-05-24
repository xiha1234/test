package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.KaoshichengjiDao;
import com.entity.KaoshichengjiEntity;
import com.entity.view.KaoshichengjiView;
import com.entity.vo.KaoshichengjiVO;
import com.service.KaoshichengjiService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("kaoshichengjiService")
public class KaoshichengjiServiceImpl extends ServiceImpl<KaoshichengjiDao, KaoshichengjiEntity> implements KaoshichengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshichengjiEntity> page = this.selectPage(
                new Query<KaoshichengjiEntity>(params).getPage(),
                new EntityWrapper<KaoshichengjiEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshichengjiEntity> wrapper) {
        Page<KaoshichengjiView> page = new Query<KaoshichengjiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page, wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<KaoshichengjiVO> selectListVO(Wrapper<KaoshichengjiEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public KaoshichengjiVO selectVO(Wrapper<KaoshichengjiEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<KaoshichengjiView> selectListView(Wrapper<KaoshichengjiEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public KaoshichengjiView selectView(Wrapper<KaoshichengjiEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }


}
