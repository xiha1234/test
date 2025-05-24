package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.KaoshixinxiEntity;
import com.entity.view.KaoshixinxiView;
import com.entity.vo.KaoshixinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 考试信息
 */
public interface KaoshixinxiDao extends BaseMapper<KaoshixinxiEntity> {

    List<KaoshixinxiVO> selectListVO(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    KaoshixinxiVO selectVO(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    List<KaoshixinxiView> selectListView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    List<KaoshixinxiView> selectListView(Pagination page, @Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

    KaoshixinxiView selectView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);


}
