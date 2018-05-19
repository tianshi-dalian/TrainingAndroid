package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.model.RegisterModel;
import com.yceshop_admin.model.listenter.OnRegListener;
import com.yceshop_admin.presenter.impl.IRegisterPresenter;
import com.yceshop_admin.view.IRegisterView;

import org.apache.commons.lang3.StringUtils;

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
        if (StringUtils.isEmpty(iRegisterView.getUserName())) {
            iRegisterView.showToastShort("账号不能为空");
            return;
        } else if (StringUtils.isEmpty(iRegisterView.getcodeName())) {
            iRegisterView.showToastShort("验证码不能为空");
            return;
        }else if (StringUtils.isEmpty(iRegisterView.getuserPass())){

            iRegisterView.showToastShort("密码不能为空");
            return;
        }
        //调用注册接口
        RegisterModel registerModel = new RegisterModel();
        registerModel.reg(iRegisterView.getUserName(), iRegisterView.getcodeName(),iRegisterView.getuserPass(), new OnRegListener<RegisterBean>() {
            @Override
            public void onSuccess(RegisterBean registerBean) {
                iRegisterView.showToastShort("用户名：" + registerBean.getData().getUserName());
                

            }



            @Override
            public void onError(String msg) {
                iRegisterView.showToastShort(msg);
            }


        });
    }
    }
