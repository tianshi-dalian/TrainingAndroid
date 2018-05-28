package com.yceshop_admin.model;

import android.support.annotation.NonNull;

import com.yceshop_admin.bean.LoginBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.ILoginModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.wsdl.LoginWsdl;

import org.apache.commons.lang3.StringUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.yceshop_admin.common.SystemApplication.retrofit;


/**
 * 登录Model
 * LoginModel
 *
 * @author gehang
 * @time 2018/5/18
 */

public class LoginModel implements ILoginModel {

    /**
     * 登录Model
     *
     * @param userName        账号
     * @param passWord        密码
     * @param onWsdlListener 结果监听
     */
    @Override
    public void login(String userName, String passWord, OnWsdlListener onWsdlListener) {
        if (StringUtils.isEmpty(userName)) {
           onWsdlListener.onError("账号不能为空");
            return;
        } else if (StringUtils.isEmpty(passWord)) {
          onWsdlListener.onError("密码不能为空");
            return;
        }
        LoginBean loginBean = new LoginBean();
        loginBean.setUserName(userName);
        loginBean.setUserPass(passWord);



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
                        onWsdlListener.onSuccess(result);
                    } else {
                        onWsdlListener.onError(result.getMessage());
                    }

                } else {
                    onWsdlListener.onError(Constant.ERROR_MSG);
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginBean> call, Throwable t) {
                onWsdlListener.onError(Constant.ERROR_MSG);
            }
        });
    }
}
