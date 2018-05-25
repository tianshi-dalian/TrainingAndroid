package com.yceshop_admin.activity.admin01;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddGoodsActivity extends CommonActivity {

    @BindView(R.id.back)
    LinearLayout back;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.title_reg)
    RelativeLayout titleReg;

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
}
