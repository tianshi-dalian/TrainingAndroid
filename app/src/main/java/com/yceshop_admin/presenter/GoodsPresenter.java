package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.GoodsBean;
import com.yceshop_admin.bean.RegisterBean;
import com.yceshop_admin.model.GoodsInformactionModel;
import com.yceshop_admin.model.GoodsListModel;
import com.yceshop_admin.model.RegisterModel;
import com.yceshop_admin.model.listenter.OnRegListener;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IGoodsPresenter;
import com.yceshop_admin.presenter.impl.IRegisterPresenter;
import com.yceshop_admin.view.IGoodsListView;
import com.yceshop_admin.view.IRegisterView;

import org.apache.commons.lang3.StringUtils;

/**
 * 注册的Presenter
 * RegisterPresenter
 *
 * @author gehang
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
        GoodsListModel goodsListModel=new GoodsListModel();
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
