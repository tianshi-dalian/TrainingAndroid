package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.GoodsInformationBean;
import com.yceshop_admin.model.GoodsInformationModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IGoodsInformationPresenter;
import com.yceshop_admin.view.IGoodsInformationView;

/**
 * 商品详情的Presenter
 * RegisterPresenter
 *
 * @author qinhp
 * @time 2018/5/18/018
 */
public class GoodsInformationPresenter implements IGoodsInformationPresenter {

    private IGoodsInformationView iGoodsInformationView;
    public GoodsInformationPresenter(IGoodsInformationView iGoodsInformationView) {
        this.iGoodsInformationView = iGoodsInformationView;
    }

    /**
     * 获取商品列表
     *
     * @param goodsId
     */
    @Override
    public void goodsInformation(int goodsId) {
        //调用model层（业务逻辑层）
        GoodsInformationModel goodsInformationModel = new GoodsInformationModel();
        goodsInformationModel.goodsInformation(goodsId,new OnWsdlListener<GoodsInformationBean>() {
            @Override
            public void onSuccess(GoodsInformationBean bean) {
                //成功了。我现在操作view
                //tu.给adapter赋值
                //给轮播图赋值
                iGoodsInformationView.loadBanner(bean.getData().getGoofsPic());
                //给商品名称赋值
                iGoodsInformationView.loadGoodsName(bean.getData().getGoodsName());
                //商品价格赋值
                iGoodsInformationView.loadGoodPrice(bean.getData().getGoodPrice());
                //给商品折扣赋值
                iGoodsInformationView.loadGoodSale(bean.getData().getGoodSale()+"折");
                //给商品折扣价赋值
                iGoodsInformationView.loadGoodsSalePrice(bean.getData().getGoodsSaleprice());
                //给商品简介赋值
                iGoodsInformationView.loadGoodsIntro(bean.getData().getGoodsIntro());


            }

            @Override
            public void onError(String msg) {

            }
        });
    }
}
