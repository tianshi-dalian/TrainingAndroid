package com.yceshop_admin.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.yceshop_admin.utils.ToastUtil;

/**
 * CommonActivity
 * CommonActivity
 *
 * @author tianshi
 * @time 2018/5/15
 */

public class CommonActivity extends FragmentActivity implements ICommonView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 短时间Toast
     *
     * @param content 内容
     */
    @Override
    public void showToastShort(String content) {
        ToastUtil.shortToast(this, content);
    }
}
