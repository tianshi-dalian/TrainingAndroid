package com.yceshop_admin.model.listenter;

/**
 * 登录监听
 * OnWsdlListener
 *
 * @author tianshi
 * @time 2018/5/14
 */

public interface OnWsdlListener<T> {
    /**
     * 成功
     *
     * @param loginBean 返回结果
     */
    void onSuccess(T loginBean);

    /**
     * 失败
     *
     * @param msg 异常消息
     */
    void onError(String msg);
}
