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
 * 考试信息
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("kaoshixinxi")
public class KaoshixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId
    private Long id;
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
     * 报名费用
     */

    private Float baomingfeiyong;
    /**
     * 注意事项
     */

    private String zhuyishixiang;
    /**
     * 教师姓名
     */

    private String jiaoshixingming;
    /**
     * 封面
     */

    private String fengmian;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public KaoshixinxiEntity() {

    }


    public KaoshixinxiEntity(T t) {
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
     * 获取：报名费用
     */
    public Float getBaomingfeiyong() {
        return baomingfeiyong;
    }

    /**
     * 设置：报名费用
     */
    public void setBaomingfeiyong(Float baomingfeiyong) {
        this.baomingfeiyong = baomingfeiyong;
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
     * 获取：教师姓名
     */
    public String getJiaoshixingming() {
        return jiaoshixingming;
    }

    /**
     * 设置：教师姓名
     */
    public void setJiaoshixingming(String jiaoshixingming) {
        this.jiaoshixingming = jiaoshixingming;
    }

    /**
     * 获取：封面
     */
    public String getFengmian() {
        return fengmian;
    }

    /**
     * 设置：封面
     */
    public void setFengmian(String fengmian) {
        this.fengmian = fengmian;
    }

}
