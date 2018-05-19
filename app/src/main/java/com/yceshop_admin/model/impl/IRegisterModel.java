package com.yceshop_admin.model.impl;

import com.yceshop_admin.model.listenter.OnRegListener;

/**
 * 注册Model
 * IRegisterModel
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public interface IRegisterModel {
    /**
     * 注册Model
     *
     * @param userName      账号
     * @param codeName      验证码
     * @param userPass      密码
     * @param onRegListener 结果监听
     */
    void reg(String userName, String codeName, String userPass, OnRegListener onRegListener);
}
