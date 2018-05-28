package com.yceshop_admin.model;

import com.yceshop_admin.bean.GoodsBean;
import com.yceshop_admin.bean.GoodsInformationBean;
import com.yceshop_admin.common.Constant;
import com.yceshop_admin.model.impl.IGoodsInformactionModel;
import com.yceshop_admin.model.impl.IGoodsListModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.wsdl.GoodsInformationWsdl;
import com.yceshop_admin.wsdl.GoodsWsdl;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.yceshop_admin.common.SystemApplication.retrofit;

/**
 * 商品详情的model
 * GoodsListModel
 *
 * @author qinhp
 * @time 2018/5/23
 */
public class GoodsInformationModel implements IGoodsInformactionModel {
    /**
     * 商品详情model
     *
     * @param goodsId        商品Id
     * @param onWsdlListener 结果监听
     */
    @Override
    public void goodsInformation(int goodsId, OnWsdlListener onWsdlListener) {
        GoodsInformationWsdl goodsInformationWsdl = retrofit.create(GoodsInformationWsdl.class);
        GoodsInformationBean goodsInformationBean=new GoodsInformationBean();
        goodsInformationBean.setGoodId(goodsId);
        Call<GoodsInformationBean> call=goodsInformationWsdl.goodsInformation(goodsInformationBean);
        call.enqueue(new Callback<GoodsInformationBean>() {
            @Override
            public void onResponse(Call<GoodsInformationBean> call, Response<GoodsInformationBean> response) {
                if (response.isSuccessful()){
                    GoodsInformationBean goodsInformationBean=response.body();
                    if (Constant.INT_1000==goodsInformationBean.getCode()){
                        //请求成功了，并且正确返回数据了
                        onWsdlListener.onSuccess(goodsInformationBean);
                    }else{
                        //请求成功了，但没有正确返回数据（有可能后台处理到了异常，例如请求参数不正确）
                        onWsdlListener.onError(goodsInformationBean.getMessage());
                    }


                }else{
                    //请求成功了，但是后台崩溃了（后台有问题，需要找后台调试）
                    onWsdlListener.onError("网络连接失败，请检查网络");
                }
            }

            @Override
            public void onFailure(Call<GoodsInformationBean> call, Throwable t) {
                //失败时走个方法
                //是不是404走这个方法
            }
        });
    }
}
