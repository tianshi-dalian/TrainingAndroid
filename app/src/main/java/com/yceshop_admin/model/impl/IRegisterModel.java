package com.yceshop_admin.model.impl;


import com.yceshop_admin.model.listenter.OnWsdlListener;

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
     * @param onWsdlListener 结果监听
     */
    void reg(String userName, String codeName, String userPass, OnWsdlListener onWsdlListener);

    /**
     * 获取验证码Model
     * @param userName
     * @param onWsdlListener
     */
    void getIdentifyCode(String userName,OnWsdlListener onWsdlListener);
}
