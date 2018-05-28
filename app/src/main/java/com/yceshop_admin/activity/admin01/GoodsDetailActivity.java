package com.yceshop_admin.activity.admin01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.presenter.GoodsInformationPresenter;
import com.yceshop_admin.utils.GlideUtils;
import com.yceshop_admin.view.IGoodsInformationView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * GoodsDetailActivity
 * 商品详情activity
 *
 * @author qinhp
 * @time 2018/5/19
 */
public class GoodsDetailActivity extends CommonActivity implements IGoodsInformationView {


    @BindView(R.id.tv_goods_pic)
    ImageView goodsPic;
    @BindView(R.id.tv_goodsName)
    TextView tvGoodsName;
    @BindView(R.id.tv_goodsSaleprice)
    TextView tvGoodsSaleprice;
    @BindView(R.id.tv_goods_price)
    TextView tvGoodsPrice;
    @BindView(R.id.tv_goodsSale)
    TextView tvGoodsSale;

    int extra_goodsId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        extra_goodsId = intent.getIntExtra("goodsId", 0);
        initData();
    }

    /**
     * 初始化view
     */
    @Override
    public void initView() {
    }

    /**
     * 初始化数据
     */
    @Override
    public void initData() {
        GoodsInformationPresenter goodsInformationPresenter = new GoodsInformationPresenter(this);
        goodsInformationPresenter.goodsInformation(extra_goodsId);
    }

    /**
     * 加载轮播图
     *
     * @param goofsPic 图片url
     */
    @Override
    public void loadBanner(String goofsPic) {
        GlideUtils.showImage(this, goofsPic, goodsPic);
    }

    /**
     * 加载商品名称
     *
     * @param goodsName 商品名称
     */
    @Override
    public void loadGoodsName(String goodsName) {
        tvGoodsName.setText(goodsName);
    }

    /**
     * 加载商品折扣价
     *
     * @param goodsSaleprice 商品折扣价
     */
    @Override
    public void loadGoodsSalePrice(String goodsSaleprice) {
        tvGoodsSaleprice.setText(goodsSaleprice);
    }

    /**
     * 加载商品原价
     *
     * @param goodPrice 商品原价
     */
    @Override
    public void loadGoodPrice(String goodPrice) {
        tvGoodsPrice.setText(goodPrice);
    }

    /**
     * 加载商品折扣
     *
     * @param goodSale 商品折扣
     */
    @Override
    public void loadGoodSale(String goodSale) {
        tvGoodsSale.setText(goodSale);
    }

    /**
     * 加载正品标签
     *
     * @param labelReak 正品标签
     */
    @Override
    public void loadLabelReak(String labelReak) {

    }

    /**
     * 加载扫码标签
     *
     * @param lableQrcode 扫码标签
     */
    @Override
    public void loadLableQrcode(String lableQrcode) {

    }

    /**
     * 加载退款标签
     *
     * @param lableQRefund 退款标签
     */
    @Override
    public void loadLableQRefund(String lableQRefund) {

    }

    /**
     * 加载商品描述
     *
     * @param goodsIntro 商品描述
     */
    @Override
    public void loadGoodsIntro(String goodsIntro) {

    }
}
