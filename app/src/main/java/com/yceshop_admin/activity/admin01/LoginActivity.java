package com.yceshop_admin.activity.admin01;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

import org.apache.commons.lang3.StringUtils;

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
    @BindView(R.id.ll_titleReturn)
    LinearLayout llTitleReturn;

    /**
     * 是否显示密码
     */
    private boolean ispw = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        titleTv.setText("会员登录");
        etUserName.addTextChangedListener(etUserNameTextWatcher);
        etPassWord.addTextChangedListener(etPassWordTextWatcher);

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
    @OnClick({R.id.bt_login, R.id.tv_reg, R.id.tv_jing_login, R.id.eye01, R.id.shanchu_t, R.id.shanchu_p})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            /**
             * 登录按钮点击事件
             * */
            case R.id.bt_login:
                LoginPresenter loginPresenter = new LoginPresenter(this);
                loginPresenter.login();

                break;
            /**
             * 快速注册按钮点击事件
             * */
            case R.id.tv_reg:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
            /**
             * 经销商登录按钮点击事件
             * */
            case R.id.tv_jing_login:
                intent = new Intent(this, AddGoodsActivity.class);
                startActivity(intent);
                break;
            /**
             * 小眼睛按钮点击事件
             *
             * */
            case R.id.eye01:

                if (ispw) {
                    ispw = false;
                    isShowPassword(etPassWord, true);
                    etPassWord.setSelection(etPassWord.length());
                    eye.setBackgroundResource(R.mipmap.btn_yanjing_n);

                } else {
                    ispw = true;
                    isShowPassword(etPassWord, false);
                    etPassWord.setSelection(etPassWord.length());
                    eye.setBackgroundResource(R.mipmap.btn_yanjing_h);
                }
                break;
            /**
             * 用户框删除按钮点击事件
             * */
            case R.id.shanchu_t:

                etUserName.setText("");
                break;
            /**
             *
             * 密码框删除按钮点击事件
             *
             * */
            case R.id.shanchu_p:

                etPassWord.setText("");
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

    /**
     * 保存用户ID
     *
     * @return 用户ID
     */
    @Override
    public void login(LoginBean loginBean) {

    }

    /**
     * 去主页
     */
    @Override
    public void goIndex() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("userId", 0);
        startActivity(intent);
    }


    /**
     * 用户输入框的监听事件
     */
    TextWatcher etUserNameTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            /**
             *
             * 如果输入框长度等于零 则将删除按钮隐藏，否则显示
             * */
            if (s.length() == 0) {
                shanchuT.setVisibility(View.GONE);
            } else {
                shanchuT.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    /**
     * 密码输入框的监听事件
     */

    TextWatcher etPassWordTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            /**
             *
             * 如果输入框长度等于零 则将删除按钮隐藏，否则显示
             * */

            if (s.length() == 0) {
                shanchuP.setVisibility(View.GONE);
            } else {
                shanchuP.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


}
