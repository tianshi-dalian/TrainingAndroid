package com.yceshop_admin.model.impl;

import com.yceshop_admin.bean.AddGoodsBean;
import com.yceshop_admin.model.listenter.OnWsdlListener;

/**
 * 添加商品的Model
 * IAddGoodsModel
 *
 * @author gehang
 * @time 2018/5/25/025
 */
public interface IAddGoodsModel {
    /**
     * 添加商品
     * @param addGoodsBean
     * @param onWsdlListener
     */
    void submit(AddGoodsBean addGoodsBean, OnWsdlListener onWsdlListener);
}
