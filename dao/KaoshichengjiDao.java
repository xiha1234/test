package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.KaoshichengjiEntity;
import com.entity.view.KaoshichengjiView;
import com.entity.vo.KaoshichengjiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 考试成绩
 */
public interface KaoshichengjiDao extends BaseMapper<KaoshichengjiEntity> {

    List<KaoshichengjiVO> selectListVO(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    KaoshichengjiVO selectVO(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    List<KaoshichengjiView> selectListView(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    List<KaoshichengjiView> selectListView(Pagination page, @Param("ew") Wrapper<KaoshichengjiEntity> wrapper);

    KaoshichengjiView selectView(@Param("ew") Wrapper<KaoshichengjiEntity> wrapper);


}
