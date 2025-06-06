package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 学生
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("xuesheng")
public class XueshengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId
    private Long id;
    /**
     * 学号
     */

    private String xuehao;
    /**
     * 密码
     */

    private String mima;
    /**
     * 学生姓名
     */

    private String xueshengxingming;
    /**
     * 性别
     */

    private String xingbie;
    /**
     * 手机号码
     */

    private String shoujihaoma;
    /**
     * 邮箱
     */

    private String youxiang;
    /**
     * 专业
     */

    private String zhuanye;
    /**
     * 班级
     */

    private String banji;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public XueshengEntity() {

    }


    public XueshengEntity(T t) {
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：学号
     */
    public String getXuehao() {
        return xuehao;
    }

    /**
     * 设置：学号
     */
    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    /**
     * 获取：密码
     */
    public String getMima() {
        return mima;
    }

    /**
     * 设置：密码
     */
    public void setMima(String mima) {
        this.mima = mima;
    }

    /**
     * 获取：学生姓名
     */
    public String getXueshengxingming() {
        return xueshengxingming;
    }

    /**
     * 设置：学生姓名
     */
    public void setXueshengxingming(String xueshengxingming) {
        this.xueshengxingming = xueshengxingming;
    }

    /**
     * 获取：性别
     */
    public String getXingbie() {
        return xingbie;
    }

    /**
     * 设置：性别
     */
    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    /**
     * 获取：手机号码
     */
    public String getShoujihaoma() {
        return shoujihaoma;
    }

    /**
     * 设置：手机号码
     */
    public void setShoujihaoma(String shoujihaoma) {
        this.shoujihaoma = shoujihaoma;
    }

    /**
     * 获取：邮箱
     */
    public String getYouxiang() {
        return youxiang;
    }

    /**
     * 设置：邮箱
     */
    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang;
    }

    /**
     * 获取：专业
     */
    public String getZhuanye() {
        return zhuanye;
    }

    /**
     * 设置：专业
     */
    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    /**
     * 获取：班级
     */
    public String getBanji() {
        return banji;
    }

    /**
     * 设置：班级
     */
    public void setBanji(String banji) {
        this.banji = banji;
    }

}
