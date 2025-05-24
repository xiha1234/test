package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.KaoshixinxiEntity;
import com.entity.view.KaoshixinxiView;
import com.entity.vo.KaoshixinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 考试信息
 */
public interface KaoshixinxiService extends IService<KaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<KaoshixinxiVO> selectListVO(Wrapper<KaoshixinxiEntity> wrapper);

    KaoshixinxiVO selectVO(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    List<KaoshixinxiView> selectListView(Wrapper<KaoshixinxiEntity> wrapper);

    KaoshixinxiView selectView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshixinxiEntity> wrapper);


}

