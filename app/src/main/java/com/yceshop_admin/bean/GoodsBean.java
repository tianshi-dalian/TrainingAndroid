package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.GoodsEntity;

import java.util.List;

/**
 * 商品列表javabean
 * GoodsBean
 *
 * @author qinhp
 * @time 2018/5/23
 */
public class GoodsBean extends CommonBean {
    /*商品id*/

//    private int codeId;
    private List<GoodsEntity> data;

    public List<GoodsEntity> getData() {
        return data;
    }

    public void setData(List<GoodsEntity> data) {
        this.data = data;
    }
}
