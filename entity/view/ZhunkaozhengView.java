package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ZhunkaozhengEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 准考证
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhunkaozheng")
public class ZhunkaozhengView extends ZhunkaozhengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public ZhunkaozhengView() {
    }

    public ZhunkaozhengView(ZhunkaozhengEntity zhunkaozhengEntity) {
        try {
            BeanUtils.copyProperties(this, zhunkaozhengEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
