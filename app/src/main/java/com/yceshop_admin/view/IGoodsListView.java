package com.yceshop_admin.view;

import com.yceshop_admin.common.ICommonView;
import com.yceshop_admin.entity.GoodsEntity;

import java.util.List;

/**
 * 商品列表View
 * IGoodsListView
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface IGoodsListView extends ICommonView{
    /**
     * 让adapter加载数据
     * @param list 数据
     */
    void loadAdapter(List<GoodsEntity> list);
}
