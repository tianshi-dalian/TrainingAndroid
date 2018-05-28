package com.yceshop_admin.model;

import android.support.annotation.NonNull;

import com.yceshop_admin.bean.IdentifyCodeBean;
import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.IRegisterModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.wsdl.RegisterWsdl;

import org.apache.commons.lang3.StringUtils;

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
     * @param userName       账号
     * @param codeName       验证码
     * @param userPass       密码
     * @param onWsdlListener 结果监听
     */
    @Override
    public void reg(String userName, String codeName, String userPass, OnWsdlListener onWsdlListener) {
        if (StringUtils.isEmpty(userName)) {
            onWsdlListener.onError("账号不能为空");
            return;
        } else if (StringUtils.isEmpty(codeName)) {
            onWsdlListener.onError("验证码不能为空");
            return;
        } else if (StringUtils.isEmpty(userPass)) {

            onWsdlListener.onError("密码不能为空");
            return;
        }
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
                        onWsdlListener.onSuccess(result);
                    } else {
                        onWsdlListener.onError(result.getMessage());
                    }

                } else {
                    onWsdlListener.onError(Constant.ERROR_MSG);
                }
            }

            @Override
            public void onFailure(@NonNull Call<RegisterBean> call, Throwable t) {
                onWsdlListener.onError(Constant.ERROR_MSG);
            }
        });
    }

    @Override
    public void getIdentifyCode(String userName, OnWsdlListener onWsdlListener) {
        IdentifyCodeBean identifyCodeBean = new IdentifyCodeBean();
        identifyCodeBean.setUserName(userName);

        RegisterWsdl registerWsdl = retrofit.create(RegisterWsdl.class);
        Call<IdentifyCodeBean> call = registerWsdl.getIdentifyCode(identifyCodeBean);
        call.enqueue(new Callback<IdentifyCodeBean>() {
            @Override
            public void onResponse(Call<IdentifyCodeBean> call, Response<IdentifyCodeBean> response) {
                //处理结果
                if (response.isSuccessful()) {
                    IdentifyCodeBean result = response.body();
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
            public void onFailure(Call<IdentifyCodeBean> call, Throwable t) {

            }
        });

    }
}



