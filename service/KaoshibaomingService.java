package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.KaoshibaomingEntity;
import com.entity.view.KaoshibaomingView;
import com.entity.vo.KaoshibaomingVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 考试报名
 */
public interface KaoshibaomingService extends IService<KaoshibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<KaoshibaomingVO> selectListVO(Wrapper<KaoshibaomingEntity> wrapper);

    KaoshibaomingVO selectVO(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    List<KaoshibaomingView> selectListView(Wrapper<KaoshibaomingEntity> wrapper);

    KaoshibaomingView selectView(@Param("ew") Wrapper<KaoshibaomingEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshibaomingEntity> wrapper);


}

