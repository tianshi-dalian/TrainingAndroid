package com.yceshop_admin.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.text.TextUtils;

import com.yceshop_admin.bean.AddGoodsBean;
import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.IAddGoodsModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.wsdl.GoodsWsdl;
import com.yceshop_admin.wsdl.RegisterWsdl;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.yceshop_admin.common.SystemApplication.retrofit;
/**
 * 添加商品
 * AddGoodsModel
 *
 * @author gehang
 * @time 2018/5/28/028
 */
public class AddGoodsModel implements IAddGoodsModel {
    /**
     * 添加商品
     * @param addGoodsBean
     * @param onWsdlListener
     */
    @Override
    public void submit(AddGoodsBean addGoodsBean, OnWsdlListener onWsdlListener) {
      /*  if (StringUtils.isEmpty(addGoodsBean.getGoodsName())) {
            onWsdlListener.onError("商品名称不能为空");
            return;
        } else if (addGoodsBean.getGoodPrice()==0) {
            onWsdlListener.onError("请输入商品价格");
            return;
        } else if (addGoodsBean.getGoodSale()==0) {
            onWsdlListener.onError("折扣不能为空");
            return;

        } else if (StringUtils.isEmpty(addGoodsBean.getGoodsIntro())) {
            onWsdlListener.onError("商品描述不能为空");
            return;
        }*/


        GoodsWsdl goodsWsdl = retrofit.create(GoodsWsdl.class);
        Call<AddGoodsBean> call = goodsWsdl.addGoods(addGoodsBean);
        call.enqueue(new Callback<AddGoodsBean>() {
            @Override
            public void onResponse(Call<AddGoodsBean> call, Response<AddGoodsBean> response) {
                //处理结果
                if (response.isSuccessful()) {
                    AddGoodsBean result = response.body();
                    if (result.getCode() == Constant.INT_1000) {
                        onWsdlListener.onSuccess(result);
                    } else {
                        onWsdlListener.onError(result.getMessage());
                    }

                } else {
                    onWsdlListener.onError(Constant.ERROR_MSG);
                }
            }

            @Override
            public void onFailure(Call<AddGoodsBean> call, Throwable t) {
                onWsdlListener.onError(Constant.ERROR_MSG);
            }
        });


    }


}

