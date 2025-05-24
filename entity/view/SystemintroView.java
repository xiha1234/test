package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.SystemintroEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 关于我们
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("systemintro")
public class SystemintroView extends SystemintroEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public SystemintroView() {
    }

    public SystemintroView(SystemintroEntity systemintroEntity) {
        try {
            BeanUtils.copyProperties(this, systemintroEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
