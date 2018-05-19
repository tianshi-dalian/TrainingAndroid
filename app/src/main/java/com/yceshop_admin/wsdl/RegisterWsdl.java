package com.yceshop_admin.wsdl;

import com.yceshop_admin.bean.RegisterBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 注册的接口
 * RegisterWsdl
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public interface RegisterWsdl {


    @POST("add/AddUser")
    Call<RegisterBean> getData(@Body RegisterBean registerBean);

}
