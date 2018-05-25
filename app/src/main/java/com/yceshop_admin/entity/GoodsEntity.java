package com.yceshop_admin.entity;

public class GoodsEntity {
    private int goodId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品原价
     */

    private double goodPrice;
    /**
     * 商品图片
     */
    private String goofsPic;
    /**
     * 商品折扣
     */
    private int goodSale;
    /**
     * 商品折扣价
     */
    private double goodsSaleprice;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoofsPic() {
        return goofsPic;
    }

    public void setGoofsPic(String goofsPic) {
        this.goofsPic = goofsPic;
    }

    public double getGoodSale() {
        return goodSale;
    }

    public void setGoodSale(int goodSale) {
        this.goodSale = goodSale;
    }

    public double getGoodsSaleprice() {
        return goodsSaleprice;
    }

    public void setGoodsSaleprice(double goodsSaleprice) {
        this.goodsSaleprice = goodsSaleprice;
    }
}
