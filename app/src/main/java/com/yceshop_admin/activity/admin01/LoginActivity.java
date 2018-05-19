package com.yceshop_admin.activity.admin01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.presenter.LoginPresenter;
import com.yceshop_admin.view.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends CommonActivity implements ILoginView {


    @BindView(R.id.et_userName)
    EditText etUserName;
    @BindView(R.id.et_passWord)
    EditText etPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //1111
    }

    /**
     * 初始化view
     */
    @Override
    public void initView() {

    }

    /**
     * 初始化数据
     */
    @Override
    public void initData() {

    }

    /**
     * 点击事件集合
     *
     * @param view
     */
    @OnClick({R.id.bt_01})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_01:
                LoginPresenter loginPresenter = new LoginPresenter(this);
                loginPresenter.login();
                break;
        }
    }

    /**
     * 获取账号
     *
     * @return 账号
     */
    @Override
    public String getUserName() {
        return etUserName.getText().toString().trim();
    }

    /**
     * 获取密码
     *
     * @return 密码
     */
    @Override
    public String getPassword() {
        return etPassWord.getText().toString().trim();
    }
}
