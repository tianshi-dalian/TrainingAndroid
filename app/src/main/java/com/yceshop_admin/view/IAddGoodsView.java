package com.yceshop_admin.view;

import com.yceshop_admin.common.ICommonView;
/**
 * 添加商品
 * IAddGoodsView
 *
 * @author gehang
 * @time 2018/5/25/025
 */
public interface IAddGoodsView extends ICommonView {

/**
 * 获取商品名称
 *
 * */

String getGoodsName();
/**
 *
 * 获取商品价格
 *
 * */
Double getGoodsPrice();

/**
 * 获取商品折扣
 *
 * */

Double getGoodsSale();

/**
 * 获取商品折后价
 * */

Double getGoodsSalePrice();

/**
 * 获取商品描述
 * */
String getGoodIntro();


/**
 * 获取商品图片*/

String getGoodPic();

/**
 * 保存图片跳转
 * */
void goGoodList();

/**
 *
 * 获取正品标签
 * */
String getLabelReak();

/**
 *
 * 获取扫码标签
 * */
String getLableQrcode();

/**
 *
 * 退款标签
 */
String getLableQrefund();

}
