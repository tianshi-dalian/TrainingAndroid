package com.yceshop_admin.adapter;

import android.app.Activity;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yceshop_admin.R;
import com.yceshop_admin.entity.GoodsEntity;
import com.yceshop_admin.entity.GoodsInformactionEntity;
import com.yceshop_admin.utils.GlideUtils;

import java.util.List;

/**
 * 商品listadapter
 * GoodsAdapter
 *
 * @author qinhp
 * @time 2018/5/24
 */
public class GoodsInformationAdapter extends BaseQuickAdapter<GoodsInformactionEntity, BaseViewHolder> {

    private Activity activity;

    public GoodsInformationAdapter(List<GoodsInformactionEntity> list, Activity activity) {
        super(R.layout.item_goods_list, list);
        this.activity = activity;
    }

    @Override
    protected void convert(BaseViewHolder helper, GoodsInformactionEntity item) {
        /**
         * 商品名字
         */
        helper.setText(R.id.tv_goodsName, item.getGoodsName());
        /**
         * 商品折扣
         */
        helper.setText(R.id.discount_commodity, item.getGoodSale() + "折");
        /**
         * 商品折扣价
         */
        helper.setText(R.id.tv_goodsSaleprice, "￥" + item.getGoodsSaleprice());
        /**
         * 商品原价
         */
        helper.setText(R.id.tv_goods_price, "￥" + item.getGoodPrice());
        /**
         * 商品正品标签
         */
        helper.setText(R.id.tv_03, item.getLabelReak());
        /**
         * 商品退款标签
         */
        helper.setText(R.id.tv_03, item.getLableQRefund());
        /**
         * 商品扫码标签
         */
        helper.setText(R.id.tv_03, item.getLableQrcode());
        /**
         * 商品描述
         */
        helper.setText(R.id.tv_03, item.getGoodsIntro());
        /**
         *商品图片
         * */
        GlideUtils.showImage(activity, item.getGoofsPic(), helper.getView(R.id.tv_goods_pic));
        helper.addOnClickListener(R.id.tv_goods_pic);


    }
}
