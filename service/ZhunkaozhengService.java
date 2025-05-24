package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZhunkaozhengEntity;
import com.entity.view.ZhunkaozhengView;
import com.entity.vo.ZhunkaozhengVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 准考证
 */
public interface ZhunkaozhengService extends IService<ZhunkaozhengEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ZhunkaozhengVO> selectListVO(Wrapper<ZhunkaozhengEntity> wrapper);

    ZhunkaozhengVO selectVO(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    List<ZhunkaozhengView> selectListView(Wrapper<ZhunkaozhengEntity> wrapper);

    ZhunkaozhengView selectView(@Param("ew") Wrapper<ZhunkaozhengEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<ZhunkaozhengEntity> wrapper);


}

