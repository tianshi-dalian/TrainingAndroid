package com.yceshop_admin.activity.admin01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;

import butterknife.ButterKnife;

/**
 * 主页activity
 * MainActivity
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class MainActivity extends CommonActivity {
int userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        intent.getIntExtra("userId",userId);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {



    }
}
