package com.yceshop_admin.view;

import com.yceshop_admin.common.ICommonView;

/**
 * 注册View
 * IRegisterView
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public interface IRegisterView  extends ICommonView {
    /**
     * 获取账号
     *
     * @return 账号
     */
    String getUserName();

    /**
     * 获取验证码
     *
     * @return  验证码
     * */
    String getcodeName();

    /**
     * 获取用户密码
     * #return 密码
     * */
    String getuserPass();
    /**
     * 注册成功跳转到登录页
     * @return 用户名
     * */
    void goLogin();


}
