package com.yceshop_admin.activity.admin01;

import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddGoodsActivity extends CommonActivity {

    @BindView(R.id.back)
    LinearLayout back;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.title_reg)
    RelativeLayout titleReg;
    @BindView(R.id.good_name)
    EditText goodName;
    @BindView(R.id.good_price)
    EditText goodPrice;
    @BindView(R.id.good_rebate)
    EditText goodRebate;
    @BindView(R.id.good_rebate_price)
    EditText goodRebatePrice;
    @BindView(R.id.btn_01)
    Button btn01;
    @BindView(R.id.btn_02)
    Button btn02;
    @BindView(R.id.btn_03)
    Button btn03;
    @BindView(R.id.iv_addphoto)
    ImageView ivAddphoto;
    @BindView(R.id.iv_delete)
    ImageView ivDelete;
    @BindView(R.id.good_content)
    EditText goodContent;
    @BindView(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgoods);
        ButterKnife.bind(this);
        title.setText("添加商品");
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.btn_01, R.id.btn_02, R.id.btn_03, R.id.iv_addphoto, R.id.iv_delete, R.id.btn_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                break;
            case R.id.btn_02:
                break;
            case R.id.btn_03:
                break;
            case R.id.iv_addphoto:
                break;
            case R.id.iv_delete:
                break;
            case R.id.btn_submit:
                break;
        }
    }
}
