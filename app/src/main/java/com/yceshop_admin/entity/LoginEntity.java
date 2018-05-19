package com.yceshop_admin.entity;

/**
 * 登录dataBean
 * LoginEntity
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class LoginEntity {
    /**
     * 手机号
     */
    private String userName;



    /**
     * 用户ID
     */

    private int userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
