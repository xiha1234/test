package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.KaoshibaomingEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 考试报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoshibaoming")
public class KaoshibaomingView extends KaoshibaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public KaoshibaomingView() {
    }

    public KaoshibaomingView(KaoshibaomingEntity kaoshibaomingEntity) {
        try {
            BeanUtils.copyProperties(this, kaoshibaomingEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
