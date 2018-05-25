package com.yceshop_admin.view;

import com.yceshop_admin.common.ICommonView;

/**
 * 商品详情页View
 * IGoodsInformationView
 *
 * @author qinhp
 * @time 2018/5/24
 */
public interface IGoodsInformationView extends ICommonView{
    /**
     * 加载轮播图
     * @param goofsPic 图片url
     */
   void loadBanner(String goofsPic);
    /**
     * 加载商品名称
     * @param goodsName 商品名称
     */
   void loadGoodsName(String goodsName);
    /**
     * 加载商品折扣价
     * @param goodsSaleprice 商品折扣价
     */
   void loadGoodsSalePrice(String goodsSaleprice);
    /**
     * 加载商品原价
     * @param goodPrice 商品原价
     */
    void loadGoodPrice(String goodPrice);
    /**
     * 加载商品折扣
     * @param goodSale 商品折扣
     */
    void loadGoodSale(String goodSale);

    /**
     * 加载正品标签
     * @param labelReak 正品标签
     */
    void loadLabelReak(String labelReak);
    /**
     * 加载扫码标签
     * @param lableQrcode 扫码标签
     */
    void loadLableQrcode(String lableQrcode);

    /**
     * 加载退款标签
     * @param lableQRefund 退款标签
     */
    void loadLableQRefund(String lableQRefund);

    /**
     * 加载商品描述
     * @param goodsIntro 商品描述
     */
    void loadGoodsIntro(String goodsIntro);
}
