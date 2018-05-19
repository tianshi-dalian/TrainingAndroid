package com.yceshop_admin.activity.admin01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.presenter.RegisterPresenter;
import com.yceshop_admin.view.IRegisterView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 快速注册页面
 * RegisterActivity
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class RegisterActivity extends CommonActivity implements IRegisterView {

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.iv_delete01)
    ImageView ivDelete01;
    @BindView(R.id.et_identifycode)
    EditText etIdentifycode;
    @BindView(R.id.iv_delete02)
    ImageView ivDelete02;
    @BindView(R.id.tv_identifycode)
    TextView tvIdentifycode;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.iv_delete03)
    ImageView ivDelete03;
    @BindView(R.id.et_recommend)
    EditText etRecommend;
    @BindView(R.id.iv_delete04)
    ImageView ivDelete04;
    @BindView(R.id.tv_Internet02)
    TextView tv02;
    @BindView(R.id.bt_reg)
    Button btReg;
    @BindView(R.id.rootLayout)
    LinearLayout rootLayout;
    @BindView(R.id.back)
    LinearLayout back;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.title_reg)
    RelativeLayout titleReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        title.setText("会员注册");
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    /**
     * 页面的点击事件汇总
     */
    @OnClick({R.id.iv_delete01, R.id.iv_delete02, R.id.tv_identifycode, R.id.iv_delete03, R.id.iv_delete04, R.id.bt_reg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            /**
             * 手机号的删除按钮点击事件
             * */
            case R.id.iv_delete01:
                break;
            /**
             * 验证码的删除按钮点击事件
             * */
            case R.id.iv_delete02:
                break;
            /**
             * 获取验证码按钮点击事件
             * */
            case R.id.tv_identifycode:

                break;
            /**
             * 密码的删除按钮点击事件
             * */
            case R.id.iv_delete03:
                break;
            /**
             *
             * 推荐码的删除按钮点击事件*/
            case R.id.iv_delete04:
                break;
            /**
             * 同意并继续的按钮点击事件
             * */
            case R.id.bt_reg:

                RegisterPresenter registerPresenter = new RegisterPresenter(this);
                registerPresenter.reg();
                break;
        }
    }

    @Override
    public String getUserName() {
        return etPhone.getText().toString().trim();
    }

    @Override
    public String getcodeName() {
        return etIdentifycode.getText().toString().trim();
    }

    @Override
    public String getuserPass() {
        return etPassword.getText().toString().trim();
    }
}
