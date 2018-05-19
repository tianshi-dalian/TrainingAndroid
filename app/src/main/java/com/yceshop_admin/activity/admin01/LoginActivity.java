package com.yceshop_admin.activity.admin01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.bean.LoginBean;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.presenter.LoginPresenter;
import com.yceshop_admin.view.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 登录页面
 * LoginActivity
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class LoginActivity extends CommonActivity implements ILoginView {


    @BindView(R.id.et_phone)
    EditText etUserName;
    @BindView(R.id.et_password)
    EditText etPassWord;
    @BindView(R.id.shanchu_t)
    ImageView shanchuT;
    @BindView(R.id.shanchu_p)
    ImageView shanchuP;
    @BindView(R.id.eye)
    ImageView eye;
    @BindView(R.id.eye01)
    LinearLayout eye01;
    @BindView(R.id.tv_forgetpassword)
    TextView tvForgetpassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.tv_jing_login)
    TextView tvJingLogin;
    @BindView(R.id.tv_reg)
    TextView tvReg;
    @BindView(R.id.tv_Internet01)
    TextView tvInternet01;

    RelativeLayout titleRl01;
    @BindView(R.id.rootLayout)
    RelativeLayout rootLayout;

    @BindView(R.id.title_tv)
    TextView titleTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        titleTv.setText("会员登录");

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
    @OnClick({R.id.bt_login, R.id.tv_reg, R.id.tv_jing_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                LoginPresenter loginPresenter = new LoginPresenter(this);
                loginPresenter.login();

                break;
            case R.id.tv_reg:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_jing_login:
                intent = new Intent(this, AddGoodsActivity.class);
                startActivity(intent);
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

    @Override
    public void login(LoginBean loginBean) {

    }


}
