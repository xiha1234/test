package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.KaoshixinxiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 考试信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoshixinxi")
public class KaoshixinxiView extends KaoshixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public KaoshixinxiView() {
    }

    public KaoshixinxiView(KaoshixinxiEntity kaoshixinxiEntity) {
        try {
            BeanUtils.copyProperties(this, kaoshixinxiEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
