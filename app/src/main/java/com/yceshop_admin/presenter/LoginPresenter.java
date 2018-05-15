package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.LoginBean;
import com.yceshop_admin.model.LoginModel;
import com.yceshop_admin.model.listenter.OnLoginListener;
import com.yceshop_admin.presenter.impl.ILoginPresenter;
import com.yceshop_admin.view.ILoginView;

import org.apache.commons.lang3.StringUtils;

/**
 * 登录Presenter
 * LoginPresenter
 *
 * @author tianshi
 * @time 2018/5/14
 */
public class LoginPresenter implements ILoginPresenter {

    private ILoginView iLoginView;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    /**
     * 登录
     */
    @Override
    public void login() {
        if (StringUtils.isEmpty(iLoginView.getUserName())) {
            iLoginView.showToastShort("账号不能为空");
            return;
        } else if (StringUtils.isEmpty(iLoginView.getPassword())) {
            iLoginView.showToastShort("密码不能为空");
            return;
        }
        //调用登录接口
        LoginModel loginModel = new LoginModel();
        loginModel.login(iLoginView.getUserName(), iLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                iLoginView.showToastShort("用户名：" + loginBean.getData().getNickName());
            }

            @Override
            public void onError(String msg) {
                iLoginView.showToastShort(msg);
            }


        });
    }
}