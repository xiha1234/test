package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZhunkaozhengEntity;
import com.entity.view.ZhunkaozhengView;
import com.entity.vo.ZhunkaozhengVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 准考证
 */
public interface ZhunkaozhengDao extends BaseMapper<ZhunkaozhengEntity> {

    List<ZhunkaozhengVO> selectListVO(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    ZhunkaozhengVO selectVO(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    List<ZhunkaozhengView> selectListView(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    List<ZhunkaozhengView> selectListView(Pagination page, @Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    ZhunkaozhengView selectView(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);


}
