package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.GoodsBean;
import com.yceshop_admin.model.GoodsListModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IGoodsPresenter;
import com.yceshop_admin.view.IGoodsListView;

/**
 * 注册的Presenter
 * RegisterPresenter
 *
 * @author qinhp
 * @time 2018/5/18/018
 */
public class GoodsPresenter implements IGoodsPresenter {
    private IGoodsListView iGoodsListView;

    public GoodsPresenter(IGoodsListView iGoodsListView) {
        this.iGoodsListView = iGoodsListView;
    }

    @Override
    public void goodsList() {
        //调用model层（业务逻辑层）
        GoodsListModel goodsListModel =new GoodsListModel();
        goodsListModel.goodsList(new OnWsdlListener<GoodsBean>() {
            @Override
            public void onSuccess(GoodsBean bean) {
                //成功了。我现在操作view
                //1.给adapter赋值
                iGoodsListView.loadAdapter(bean.getData());

            }

            @Override
            public void onError(String msg) {

            }
        });


    }
}
