package com.yceshop_admin.model;

import android.support.annotation.NonNull;

import com.yceshop_admin.bean.LoginBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.ILoginModel;
import com.yceshop_admin.model.listenter.OnLoginListener;
import com.yceshop_admin.wsdl.LoginWsdl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.yceshop_admin.common.SystemApplication.retrofit;


/**
 * 登录Model
 * LoginModel
 *
 * @author tianshi
 * @time 2018/5/14
 */

public class LoginModel implements ILoginModel {

    /**
     * 登录Model
     *
     * @param userName        账号
     * @param passWord        密码
     * @param onLoginListener 结果监听
     */
    @Override
    public void login(String userName, String passWord, OnLoginListener onLoginListener) {
        LoginBean loginBean = new LoginBean();
        loginBean.setUcode(userName);
        loginBean.setUserPw(passWord);
        //调用数据库
        LoginWsdl loginWsdl = retrofit.create(LoginWsdl.class);
        Call<LoginBean> call = loginWsdl.getData(loginBean);
        call.enqueue(new Callback<LoginBean>() {
            @Override
            public void onResponse(@NonNull Call<LoginBean> call, @NonNull Response<LoginBean> response) {
                //处理结果
                if (response.isSuccessful()) {
                    LoginBean result = response.body();
                    if (result.getCode() == Constant.INT_1000) {
                        onLoginListener.onSuccess(result);
                    } else {
                        onLoginListener.onError(result.getMessage());
                    }

                } else {
                    onLoginListener.onError(Constant.ERROR_MSG);
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginBean> call, Throwable t) {
                onLoginListener.onError(Constant.ERROR_MSG);
            }
        });
    }
}
