package com.entity.vo;

import java.io.Serializable;


/**
 * 准考证
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class ZhunkaozhengVO implements Serializable {
    private static final long serialVersionUID = 1L;


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
     * 头像
     */

    private String touxiang;

    /**
     * 准考证下载
     */

    private String zhunkaozhengxiazai;

    /**
     * 教师账号
     */

    private String jiaoshizhanghao;

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
     * 获取：头像
     */
    public String getTouxiang() {
        return touxiang;
    }

    /**
     * 设置：头像
     */

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
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

    /**
     * 获取：教师账号
     */
    public String getJiaoshizhanghao() {
        return jiaoshizhanghao;
    }

    /**
     * 设置：教师账号
     */

    public void setJiaoshizhanghao(String jiaoshizhanghao) {
        this.jiaoshizhanghao = jiaoshizhanghao;
    }

}
