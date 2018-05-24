package com.yceshop_admin.model.impl;

import com.yceshop_admin.model.listenter.OnWsdlListener;

/**
 * 商品详情model
 * IGoodsListModel
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface IGoodsInformactionModel {
    /**
     * 商品详情model
     *  @param onWsdlListener 结果监听
     */
    void goodsInformation(OnWsdlListener onWsdlListener);
}
