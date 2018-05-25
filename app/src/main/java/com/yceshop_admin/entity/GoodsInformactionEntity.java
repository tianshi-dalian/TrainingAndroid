package com.yceshop_admin.entity;

/**
 * 商品详情datebean
 * GoodsInformactionEntity
 *
 * @author qinhp
 * @time 2018/5/24
 */
public class GoodsInformactionEntity {
    /**
     * 商品名字
     */
    private String goodsName;
    /**
     * 商品原价格
     */
    private String goodPrice;
    /**
     * 商品原价格
     */
    private String goofsPic;
    /**
     * 商品折扣
     */
    private String goodSale;
    /**
     * 商品折扣价
     */
    private String goodsSaleprice;
    /**
     * 商品正品标签
     */
    private String labelReak;
    /**
     * 商品退款标签
     */
    private String lableQRefund;
    /**
     * 商品扫码标签
     */
    private String lableQrcode;


    /**
     * 商品描述
     */
    private String goodsIntro;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoofsPic() {
        return goofsPic;
    }

    public void setGoofsPic(String goofsPic) {
        this.goofsPic = goofsPic;
    }

    public String getGoodSale() {
        return goodSale;
    }

    public void setGoodSale(String goodSale) {
        this.goodSale = goodSale;
    }

    public String getGoodsSaleprice() {
        return goodsSaleprice;
    }

    public void setGoodsSaleprice(String goodsSaleprice) {
        this.goodsSaleprice = goodsSaleprice;
    }

    public String getLabelReak() {
        return labelReak;
    }

    public void setLabelReak(String labelReak) {
        this.labelReak = labelReak;
    }

    public String getLableQRefund() {
        return lableQRefund;
    }

    public void setLableQRefund(String lableQRefund) {
        this.lableQRefund = lableQRefund;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro;
    }
    public String getLableQrcode() {
        return lableQrcode;
    }

    public void setLableQrcode(String lableQrcode) {
        this.lableQrcode = lableQrcode;
    }

}
