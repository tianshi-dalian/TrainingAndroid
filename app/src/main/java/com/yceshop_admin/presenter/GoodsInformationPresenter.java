package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.GoodsInformationBean;
import com.yceshop_admin.model.GoodsInformationModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IGoodsInformationPresenter;
import com.yceshop_admin.view.IGoodsInformationView;

/**
 * 注册的Presenter
 * RegisterPresenter
 *
 * @author gehang
 * @time 2018/5/18/018
 */
public class GoodsInformationPresenter implements IGoodsInformationPresenter {
    private IGoodsInformationView iGoodsInformationView;

    public GoodsInformationPresenter(IGoodsInformationView iGoodsInformationView) {
        this.iGoodsInformationView = iGoodsInformationView;
    }

    @Override
    public void goodsInformation() {
        //调用model层（业务逻辑层）
        GoodsInformationModel goodsInformationModel =new GoodsInformationModel();
        goodsInformationModel.goodsInformation(new OnWsdlListener<GoodsInformationBean>() {
            @Override
            public void onSuccess(GoodsInformationBean bean) {
                //成功了。我现在操作view
                //1.给adapter赋值
                //给轮播图赋值
                iGoodsInformationView.loadBanner(bean.getData().getGoofsPic());
                //给商品名称赋值
                iGoodsInformationView.loadGoodsName(bean.getData().getGoodsName());
                //商品价格赋值
                iGoodsInformationView.loadGoodPrice(bean.getData().getGoodPrice());
                //给商品折扣赋值
                iGoodsInformationView.loadGoodSale(bean.getData().getGoodSale());
                //给商品折扣价赋值
                iGoodsInformationView.loadGoodsSalePrice(bean.getData().getGoodsSaleprice());



            }

            @Override
            public void onError(String msg) {

            }
        });


    }
}
