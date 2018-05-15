package com.yceshop_admin.entity;

/**
 * 登录结果entity
 * LoginEntity
 *
 * @author tianshi
 * @time 2018/5/15
 */

public class LoginEntity {
    /**
     * 用户token
     */
    private String token;
    /**
     * 用户手机号码
     */
    private String phone;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 经销商头像（仅经销商模式下有值）
     */
    private String logoUrl;
    /**
     * 性别(0：男，1：女)
     */
    private int gender;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
