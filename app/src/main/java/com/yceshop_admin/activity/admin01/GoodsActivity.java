package com.yceshop_admin.activity.admin01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yceshop_admin.R;
import com.yceshop_admin.adapter.GoodsAdapter;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.entity.GoodsEntity;
import com.yceshop_admin.presenter.GoodsPresenter;
import com.yceshop_admin.view.IGoodsListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 商品列表
 * GoodsActivity
 *
 * @author qinhp
 * @time 2018/5/19
 */
public class GoodsActivity extends CommonActivity implements IGoodsListView{

    @BindView(R.id.list_recyclerView)
    RecyclerView listRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initData();

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {
        GoodsPresenter goodsPresenter= new GoodsPresenter(this);
        goodsPresenter.goodsList();
    }

    /**
     * 让adapter加载数据
     *
     * @param list 数据
     */
    @Override
    public void loadAdapter(List<GoodsEntity> list) {
        listRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        GoodsAdapter goodsAdapter = new GoodsAdapter(list,this);
        listRecyclerView.setAdapter(goodsAdapter);
        /**
         * 跳转到详情页
         */
        goodsAdapter.setOnItemClickListener((adapter, view, position) -> {
            Intent intent = new Intent(GoodsActivity.this,GoodsDetailActivity.class);
//                intent.putExtra("goodsId", GoodsBean);
            startActivityForResult(intent,1);
        });
    }
}
