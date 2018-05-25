package com.yceshop_admin.model.listenter;

/**
 * 监听
 * OnWsdlListener
 *
 * @author tianshi
 * @time 2018/5/14
 */

public interface OnWsdlListener<T> {
    /**
     * 成功
     *
     * @param bean 返回结果
     */
    void onSuccess(T bean);

    /**
     * 失败
     *
     * @param msg 异常消息
     */
    void onError(String msg);
}
