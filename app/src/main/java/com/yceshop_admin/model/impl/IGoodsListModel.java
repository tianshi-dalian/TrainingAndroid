package com.yceshop_admin.model.impl;

import com.yceshop_admin.model.listenter.OnWsdlListener;

/**
 * 商品列表model
 * IGoodsListModel
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface IGoodsListModel {
    /**
     * 商品列表Model
     *  @param onWsdlListener 结果监听
     */
    void goodsList(OnWsdlListener onWsdlListener);
}
