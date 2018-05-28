package com.yceshop_admin.presenter;

import com.yceshop_admin.bean.AddGoodsBean;
import com.yceshop_admin.model.AddGoodsModel;
import com.yceshop_admin.model.listenter.OnWsdlListener;
import com.yceshop_admin.presenter.impl.IAddGoodsPresenter;
import com.yceshop_admin.view.IAddGoodsView;
/**
 * 添加商品的保存事件
 * AddGoodsPresenter
 *
 * @author gehang
 * @time 2018/5/25/025
 */
public class AddGoodsPresenter implements IAddGoodsPresenter {
private  IAddGoodsView iAddGoodsView;

public  AddGoodsPresenter(IAddGoodsView iAddGoodsView){

    this.iAddGoodsView=iAddGoodsView;
}
/**
 * 保存图片
 * */
    @Override
    public void submit() {
        //调用添加商品的接口
        AddGoodsBean addGoodsBean= new AddGoodsBean();
        addGoodsBean.setUserId(addGoodsBean.getUserId());
        addGoodsBean.setGoodsName(iAddGoodsView.getGoodsName());
        addGoodsBean.setGoodPrice(iAddGoodsView.getGoodsPrice());
        addGoodsBean.setGoodSale(iAddGoodsView.getGoodsSale());
        addGoodsBean.setGoodsIntro(iAddGoodsView.getGoodIntro());
        addGoodsBean.setGoodsSaleprice(iAddGoodsView.getGoodsSalePrice());
        addGoodsBean.setGoofsPic(iAddGoodsView.getGoodPic());
        addGoodsBean.setLabelReak(iAddGoodsView.getLabelReak());
        addGoodsBean.setLableQrcode(iAddGoodsView.getLableQrcode());
        addGoodsBean.setLableQrefund(iAddGoodsView.getLableQrefund());

        AddGoodsModel addGoodsModel = new AddGoodsModel();
        addGoodsModel.submit(addGoodsBean, new OnWsdlListener<AddGoodsBean>() {
                    @Override
                    public void onSuccess(AddGoodsBean bean) {
                        iAddGoodsView.goGoodList();

                    }

                    @Override
                    public void onError(String msg) {
                        iAddGoodsView.showToastShort(msg);
                    }
                });
 }
}
