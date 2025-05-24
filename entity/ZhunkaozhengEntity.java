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
 * 准考证
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("zhunkaozheng")
public class ZhunkaozhengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId
    private Long id;
    /**
     * 准考证编号
     */

    private String zhunkaozhengbianhao;
    /**
     * 考试编号
     */

    private String kaoshibianhao;
    /**
     * 科目名称
     */

    private String kemumingcheng;
    /**
     * 考试时间
     */

    private String kaoshishijian;
    /**
     * 考试地点
     */

    private String kaoshididian;
    /**
     * 注意事项
     */

    private String zhuyishixiang;
    /**
     * 学号
     */

    private String xuehao;
    /**
     * 学生姓名
     */

    private String xueshengxingming;
    /**
     * 准考证下载
     */

    private String zhunkaozhengxiazai;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public ZhunkaozhengEntity() {

    }


    public ZhunkaozhengEntity(T t) {
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
     * 获取：准考证编号
     */
    public String getZhunkaozhengbianhao() {
        return zhunkaozhengbianhao;
    }

    /**
     * 设置：准考证编号
     */
    public void setZhunkaozhengbianhao(String zhunkaozhengbianhao) {
        this.zhunkaozhengbianhao = zhunkaozhengbianhao;
    }

    /**
     * 获取：考试编号
     */
    public String getKaoshibianhao() {
        return kaoshibianhao;
    }

    /**
     * 设置：考试编号
     */
    public void setKaoshibianhao(String kaoshibianhao) {
        this.kaoshibianhao = kaoshibianhao;
    }

    /**
     * 获取：科目名称
     */
    public String getKemumingcheng() {
        return kemumingcheng;
    }

    /**
     * 设置：科目名称
     */
    public void setKemumingcheng(String kemumingcheng) {
        this.kemumingcheng = kemumingcheng;
    }

    /**
     * 获取：考试时间
     */
    public String getKaoshishijian() {
        return kaoshishijian;
    }

    /**
     * 设置：考试时间
     */
    public void setKaoshishijian(String kaoshishijian) {
        this.kaoshishijian = kaoshishijian;
    }

    /**
     * 获取：考试地点
     */
    public String getKaoshididian() {
        return kaoshididian;
    }

    /**
     * 设置：考试地点
     */
    public void setKaoshididian(String kaoshididian) {
        this.kaoshididian = kaoshididian;
    }

    /**
     * 获取：注意事项
     */
    public String getZhuyishixiang() {
        return zhuyishixiang;
    }

    /**
     * 设置：注意事项
     */
    public void setZhuyishixiang(String zhuyishixiang) {
        this.zhuyishixiang = zhuyishixiang;
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
     * 获取：准考证下载
     */
    public String getZhunkaozhengxiazai() {
        return zhunkaozhengxiazai;
    }

    /**
     * 设置：准考证下载
     */
    public void setZhunkaozhengxiazai(String zhunkaozhengxiazai) {
        this.zhunkaozhengxiazai = zhunkaozhengxiazai;
    }


}
