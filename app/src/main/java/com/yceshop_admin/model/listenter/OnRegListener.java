package com.yceshop_admin.model.listenter;
/**
 * 注册监听
 * OnRegListener
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public interface OnRegListener<T> {

    /**
     * 注册成功
     * @param registerBean 返回结果
     *
     * */
    void onSuccess(T registerBean);



    /**
     * 注册失败
     * @param msg 返回结果
     *
     * */
    void onError(String msg);
}
