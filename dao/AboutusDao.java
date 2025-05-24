package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.AboutusEntity;
import com.entity.view.AboutusView;
import com.entity.vo.AboutusVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 关于我们
 */
public interface AboutusDao extends BaseMapper<AboutusEntity> {

    List<AboutusVO> selectListVO(@Param("ew") Wrapper<AboutusEntity> wrapper);

    AboutusVO selectVO(@Param("ew") Wrapper<AboutusEntity> wrapper);

    List<AboutusView> selectListView(@Param("ew") Wrapper<AboutusEntity> wrapper);

    List<AboutusView> selectListView(Pagination page, @Param("ew") Wrapper<AboutusEntity> wrapper);

    AboutusView selectView(@Param("ew") Wrapper<AboutusEntity> wrapper);


}
