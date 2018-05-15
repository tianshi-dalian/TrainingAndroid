package com.yceshop_admin.model.impl;

import com.yceshop_admin.model.listenter.OnLoginListener;

/**
 * 登录Model
 * ILoginModel
 *
 * @author tianshi
 * @time 2018/5/14
 */

public interface ILoginModel {
    /**
     * 登录Model
     *
     * @param userName        账号
     * @param passWord        密码
     * @param onLoginListener 结果监听
     */
    void login(String userName, String passWord, OnLoginListener onLoginListener);
}
