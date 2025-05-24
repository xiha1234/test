package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.KaoshichengjiEntity;
import com.entity.view.KaoshichengjiView;
import com.entity.vo.KaoshichengjiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 考试成绩
 */
public interface KaoshichengjiService extends IService<KaoshichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<KaoshichengjiVO> selectListVO(Wrapper<KaoshichengjiEntity> wrapper);

    KaoshichengjiVO selectVO(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    List<KaoshichengjiView> selectListView(Wrapper<KaoshichengjiEntity> wrapper);

    KaoshichengjiView selectView(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshichengjiEntity> wrapper);


}

