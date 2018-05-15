package com.yceshop_admin.wsdl;

import com.yceshop_admin.bean.LoginBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 登录部分接口
 * LoginWsdl
 *
 * @author tianshi
 * @time 2018/5/15
 */

public interface LoginWsdl {
    @POST("api0201001/login")
    Call<LoginBean> getData(@Body LoginBean loginBean);
}
