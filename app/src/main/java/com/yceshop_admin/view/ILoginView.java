package com.yceshop_admin.view;

import com.yceshop_admin.bean.LoginBean;
import com.yceshop_admin.common.ICommonView;

/**
 * 登录View
 * ILoginView
 *
 * @author tianshi
 * @time 2018/5/14
 */

public interface ILoginView extends ICommonView {
    /**
     * 获取账号
     *
     * @return 账号
     */
    String getUserName();

    /**
     * 获取密码
     *
     * @return 密码
     */
    String getPassword();

    /**
     * 会员登录 接口回调
     *
     * @param loginBean
     */
    void login(LoginBean loginBean);

    /**
     * 登录成功跳转到主页
     * */
    void goIndex();

}
