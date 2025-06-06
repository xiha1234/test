package com.entity.vo;

import java.io.Serializable;


/**
 * 学生
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class XueshengVO implements Serializable {
    private static final long serialVersionUID = 1L;


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

    /**
     * 头像
     */

    private String touxiang;

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

}
