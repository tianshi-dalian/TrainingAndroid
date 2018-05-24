package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;
import com.yceshop_admin.entity.GoodsInformactionEntity;

/**
 * 商品javabean
 * GoodsInformationBean
 *
 * @author qinhp
 * @time 2018/5/24
 */
public class GoodsInformationBean  extends CommonBean{
    /**
     * 商品ID
     */
    private int goodId;//这是输入参数
    /**
     * 后台返回数据
     */
    private GoodsInformactionEntity data;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public GoodsInformactionEntity getData() {
        return data;
    }

    public void setData(GoodsInformactionEntity data) {
        this.data = data;
    }
}
