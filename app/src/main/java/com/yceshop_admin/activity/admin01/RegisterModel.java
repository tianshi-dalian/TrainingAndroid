package com.yceshop_admin.activity.admin01;

import android.support.annotation.NonNull;

import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.IRegisterModel;
import com.yceshop_admin.model.listenter.OnRegListener;
import com.yceshop_admin.wsdl.RegisterWsdl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.yceshop_admin.common.SystemApplication.retrofit;

/**
 * 注册的MOdel
 * RegisterModel
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class RegisterModel implements IRegisterModel {

    /**
     * 注册Model
     *
     * @param userName 账号
     * @param codeName 验证码
     * @param userPass 用户密码
     **/
    @Override
    public void reg(String userName, String codeName, String userPass, OnRegListener onRegListener) {
        RegisterBean registerBean = new RegisterBean();
        registerBean.setUserName(userName);
        registerBean.setCodeName(codeName);
        registerBean.setUserPass(userPass);
        //调用数据库
        RegisterWsdl registerWsdl = retrofit.create(RegisterWsdl.class);
        Call<RegisterBean> call = registerWsdl.getData(registerBean);
        call.enqueue(new Callback<RegisterBean>() {
            @Override
            public void onResponse(@NonNull Call<RegisterBean> call, @NonNull Response<RegisterBean> response) {
                //处理结果
                if (response.isSuccessful()) {
                    RegisterBean result = response.body();
                    if (result.getCode() == Constant.INT_1000) {
                        onRegListener.onSuccess(result);
                    } else {
                        onRegListener.onError(result.getMessage());
                    }

                } else {
                    onRegListener.onError(Constant.ERROR_MSG);
                }
            }

            @Override
            public void onFailure(@NonNull Call<RegisterBean> call, Throwable t) {
                onRegListener.onError(Constant.ERROR_MSG);
            }
        });
    }
}



