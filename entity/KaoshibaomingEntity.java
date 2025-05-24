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
 * 考试报名
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("kaoshibaoming")
public class KaoshibaomingEntity<T> implements Serializable {
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
     * 报名时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date baomingshijian;
    /**
     * 学号
     */

    private String xuehao;
    /**
     * 学生姓名
     */

    private String xueshengxingming;
    /**
     * 手机号码
     */

    private String shoujihaoma;
    /**
     * 是否审核
     */

    private String sfsh;
    /**
     * 审核回复
     */

    private String shhf;
    /**
     * 是否支付
     */

    private String ispay;
    /**
     * 跨表用户id
     */

    private Long crossuserid;
    /**
     * 跨表主键id
     */

    private Long crossrefid;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public KaoshibaomingEntity() {

    }


    public KaoshibaomingEntity(T t) {
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
     * 获取：报名时间
     */
    public Date getBaomingshijian() {
        return baomingshijian;
    }

    /**
     * 设置：报名时间
     */
    public void setBaomingshijian(Date baomingshijian) {
        this.baomingshijian = baomingshijian;
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
     * 获取：是否审核
     */
    public String getSfsh() {
        return sfsh;
    }

    /**
     * 设置：是否审核
     */
    public void setSfsh(String sfsh) {
        this.sfsh = sfsh;
    }

    /**
     * 获取：审核回复
     */
    public String getShhf() {
        return shhf;
    }

    /**
     * 设置：审核回复
     */
    public void setShhf(String shhf) {
        this.shhf = shhf;
    }

    /**
     * 获取：是否支付
     */
    public String getIspay() {
        return ispay;
    }

    /**
     * 设置：是否支付
     */
    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    /**
     * 获取：跨表用户id
     */
    public Long getCrossuserid() {
        return crossuserid;
    }

    /**
     * 设置：跨表用户id
     */
    public void setCrossuserid(Long crossuserid) {
        this.crossuserid = crossuserid;
    }

    /**
     * 获取：跨表主键id
     */
    public Long getCrossrefid() {
        return crossrefid;
    }

    /**
     * 设置：跨表主键id
     */
    public void setCrossrefid(Long crossrefid) {
        this.crossrefid = crossrefid;
    }

}