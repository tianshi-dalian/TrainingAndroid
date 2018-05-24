package com.yceshop_admin.wsdl;

import com.yceshop_admin.bean.GoodsBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 关于商品相关的所有接口
 * GoodsWsdl
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface GoodsWsdl {
    /**
     * 获取商品列表
     * @param goodsBean 传入参数
     * @return 传出参数
     */
    @POST("goods/goodsList")
    Call<GoodsBean> goodsList(@Body GoodsBean goodsBean);
}
