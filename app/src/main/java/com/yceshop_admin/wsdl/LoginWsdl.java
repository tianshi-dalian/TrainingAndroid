package com.yceshop_admin.wsdl;

import com.yceshop_admin.bean.LoginBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 登录部分接口
 * LoginWsdl
 *
 * @author gehang
 * @time 2018/5/18
 */

public interface LoginWsdl {
    @POST("login/LoginUser")
    Call<LoginBean> getData(@Body LoginBean loginBean);
}
