package com.yceshop_admin.model.listenter;

import com.yceshop_admin.bean.LoginBean;

/**
 * 登录监听
 * OnLoginListener
 *
 * @author tianshi
 * @time 2018/5/14
 */

public interface OnLoginListener {
    /**
     * 成功
     *
     * @param loginBean 返回结果
     */
    void onSuccess(LoginBean loginBean);

    /**
     * 失败
     *
     * @param msg 异常消息
     */
    void onError(String msg);
}
