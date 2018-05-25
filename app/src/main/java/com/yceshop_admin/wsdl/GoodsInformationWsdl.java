package com.yceshop_admin.wsdl;

import com.yceshop_admin.bean.GoodsBean;
import com.yceshop_admin.bean.GoodsInformationBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 获取单个商品详情
 * GoodsInformationWsdl
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface GoodsInformationWsdl {
    /**
     * 获取商品列表
     * @param goodsInformationBean 传入参数
     * @return 传出参数
     */
    @POST("goods/goodsInformation")
    Call<GoodsInformationBean> goodsInformation(@Body GoodsInformationBean goodsInformationBean);
}
