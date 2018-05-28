package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.IdentifyCodeBean;
import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.model.RegisterModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IRegisterPresenter;
import com.yceshop_admin.view.IRegisterView;

/**
 * 注册的Presenter
 * RegisterPresenter
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class RegisterPresenter implements IRegisterPresenter {
    private IRegisterView iRegisterView;

    public RegisterPresenter(IRegisterView iRegisterView) {
        this.iRegisterView = iRegisterView;
    }

    /**
     * 注册
     */
    @Override
    public void reg() {

        //调用注册接口
        RegisterModel registerModel = new RegisterModel();
        registerModel.reg(iRegisterView.getUserName(), iRegisterView.getcodeName(),iRegisterView.getuserPass(), new OnWsdlListener<RegisterBean>() {


            @Override
            public void onSuccess(RegisterBean bean) {
                iRegisterView.goLogin();
            }

            @Override
            public void onError(String msg) {

            }
        });
    }

    @Override
    public void getIdentifyCode() {
        //调用获取验证码借口
        RegisterModel registerModel = new RegisterModel();
        registerModel.getIdentifyCode(iRegisterView.getUserName(), new OnWsdlListener<IdentifyCodeBean>() {

            @Override
            public void onSuccess(IdentifyCodeBean bean) {
               iRegisterView.showToastShort("验证码"+bean.getData().getCodeName());
            }

            @Override
            public void onError(String msg) {

            }
        });
    }
}
