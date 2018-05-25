package com.yceshop_admin.adapter;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yceshop_admin.R;
import com.yceshop_admin.entity.GoodsEntity;
import com.yceshop_admin.utils.GlideUtils;

import java.util.List;
/**
 * 商品listadapter
 * GoodsAdapter
 *
 * @author qinhp
 * @time 2018/5/24
 */
public class GoodsAdapter extends BaseQuickAdapter<GoodsEntity,BaseViewHolder> {


    private Activity activity;
    public GoodsAdapter(List<GoodsEntity> list,Activity activity){
        super(R.layout.item_goods_list,list);
        this.activity = activity;
    }

    @Override
    protected void convert(BaseViewHolder helper, GoodsEntity item) {

        /**
         * 商品名字
         */
        helper.setText(R.id.tv_01,item.getGoodsName());
        /**
         * 商品折扣
         */
        helper.setText(R.id.discount_commodity,item.getGoodSale()+"折");
        /**
         * 商品折扣价
         */
        helper.setText(R.id.tv_02,"￥"+item.getGoodsSaleprice());
        /**
         * 商品原价
         */
        helper.setText(R.id.tv_03,"￥"+item.getGoodPrice());

        /**
         *商品图片
         * */
//        GlideUtils.showImage(activity,item.getGoodfsPic(),helper.getView(R.id.commodity_pic));
//        Glide.with(mContext).load(item.getGoodfsPic()).crossFade().into((ImageView) helper.getView(R.id.commodity_pic));

        GlideUtils.showImage(activity,item.getGoofsPic(),helper.getView(R.id.commodity_pic));
        helper.addOnClickListener(R.id.commodity_pic);


    }

}
