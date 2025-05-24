package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.KaoshibaomingEntity;
import com.entity.view.KaoshibaomingView;
import com.entity.vo.KaoshibaomingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 考试报名
 */
public interface KaoshibaomingDao extends BaseMapper<KaoshibaomingEntity> {

    List<KaoshibaomingVO> selectListVO(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    KaoshibaomingVO selectVO(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    List<KaoshibaomingView> selectListView(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    List<KaoshibaomingView> selectListView(Pagination page, @Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    KaoshibaomingView selectView(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);


}
