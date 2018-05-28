package com.yceshop_admin.bean;

import com.yceshop_admin.common.CommonBean;

public class AddGoodsBean extends CommonBean{
    /**
     * 用户ID
     */
    private int userId;

    /**
     * 商品名字

     */

    private String goodsName;

    /**
     * 商品价格
     */
    private Double goodPrice;

    /**
     * 商品图片
     */
    private String goofsPic;

    /**
     * 折扣
     */
    private Double goodSale;

    /**
     * 正品标签
     */
    private String labelReak;

    /**
     * 扫码标签
     */
    private String lableQrcode;
    /**
     * 退款标签
     */

    private String lableQrefund;
    /**
     * 商品描述
     */
    private String goodsIntro;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoofsPic() {
        return goofsPic;
    }

    public void setGoofsPic(String goofsPic) {
        this.goofsPic = goofsPic;
    }

    public Double getGoodSale() {
        return goodSale;
    }

    public void setGoodSale(Double goodSale) {
        this.goodSale = goodSale;
    }

    public String getLabelReak() {
        return labelReak;
    }

    public void setLabelReak(String labelReak) {
        this.labelReak = labelReak;
    }

    public String getLableQrcode() {
        return lableQrcode;
    }

    public void setLableQrcode(String lableQrcode) {
        this.lableQrcode = lableQrcode;
    }

    public String getLableQrefund() {
        return lableQrefund;
    }

    public void setLableQrefund(String lableQrefund) {
        this.lableQrefund = lableQrefund;
    }

    public String getGoodsIntro() {
        return goodsIntro;
    }

    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro;
    }

    public Double getGoodsSaleprice() {
        return goodsSaleprice;
    }

    public void setGoodsSaleprice(Double goodsSaleprice) {
        this.goodsSaleprice = goodsSaleprice;
    }

    /**

     * 折扣价
     */
    private Double goodsSaleprice;

}
