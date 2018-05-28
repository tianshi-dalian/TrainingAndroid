package com.yceshop_admin.common;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

/**
 * SystemApplication
 * SystemApplication
 *
 * @author tianshi
 * @time 2018/5/15
 */

public class SystemApplication extends Application {
    public static Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Retrofit
        createRetrofit();

    }

    public void createRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder().
                connectTimeout(15, TimeUnit.SECONDS).
                readTimeout(15, TimeUnit.SECONDS).
                writeTimeout(15, TimeUnit.SECONDS).build();
        //tu.创建Retrofit对象
        retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(FastJsonConverterFactory.create())//解析方法
                .baseUrl(Constant.BASE_URL)//主机地址
                .build();
    }
}
