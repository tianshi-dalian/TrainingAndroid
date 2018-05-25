package com.yceshop_admin.model;

import com.yceshop_admin.bean.GoodsBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.IGoodsListModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.wsdl.GoodsWsdl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.yceshop_admin.common.SystemApplication.retrofit;

/**
 * 商品列表的model
 * GoodsListModel
 *
 * @author qinhp
 * @time 2018/5/23
 */
public class GoodsListModel implements IGoodsListModel {
    /**
     * 商品列表Model
     *
     * @param onWsdlListener 结果监听
     */
    @Override
    public void goodsList(OnWsdlListener onWsdlListener) {
        GoodsWsdl goodsWsdl = retrofit.create(GoodsWsdl.class);
        GoodsBean goodsBean = new GoodsBean();
        Call<GoodsBean> call = goodsWsdl.goodsList(goodsBean);
        call.enqueue(new Callback<GoodsBean>() {
            @Override
            public void onResponse(Call<GoodsBean> call, Response<GoodsBean> response) {
                if (response.isSuccessful()) {
                    GoodsBean goodsBean1 = response.body();
                    if (Constant.INT_1000 == goodsBean1.getCode()) {
                        //请求成功了，并且正确返回数据了
                        onWsdlListener.onSuccess(goodsBean1);
                    } else {
                        //请求成功了，但没有正确返回数据（有可能后台处理到了异常，例如请求参数不正确）
                        onWsdlListener.onError(goodsBean1.getMessage());
                        GoodsBean goodsBean = response.body();
                        if (Constant.INT_1000 == goodsBean.getCode()) {
                            //请求成功了，并且正确返回数据了
                            onWsdlListener.onSuccess(goodsBean);
                        } else {
                            //请求成功了，但没有正确返回数据（有可能后台处理到了异常，例如请求参数不正确）
                            onWsdlListener.onError(goodsBean.getMessage());
                        }


                    }
                } else {
                    //请求成功了，但是后台崩溃了（后台有问题，需要找后台调试）
                    onWsdlListener.onError("网络连接失败，请检查网络");
                }
            }

            @Override
            public void onFailure(Call<GoodsBean> call, Throwable t) {
                //失败时走个方法
                //是不是404走这个方法
            }
        });
    }
}
