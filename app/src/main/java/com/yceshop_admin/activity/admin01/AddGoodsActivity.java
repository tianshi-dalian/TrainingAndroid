package com.yceshop_admin.activity.admin01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yceshop_admin.R;
import com.yceshop_admin.common.CommonActivity;
import com.yceshop_admin.presenter.AddGoodsPresenter;
import com.yceshop_admin.presenter.RegisterPresenter;
import com.yceshop_admin.view.IAddGoodsView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * 添加商品
 * AddGoodsActivity
 *
 * @author gehang
 * @time 2018/5/28/028
 */
public class AddGoodsActivity extends CommonActivity implements IAddGoodsView {

    @BindView(R.id.back)
    LinearLayout back;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.title_reg)
    RelativeLayout titleReg;
    @BindView(R.id.good_name)
    EditText goodName;
    @BindView(R.id.good_price)
    EditText goodPrice;
    @BindView(R.id.good_rebate)
    EditText goodRebate;
    @BindView(R.id.good_rebate_price)
    EditText goodRebatePrice;
    @BindView(R.id.btn_01)
    Button btn01;
    @BindView(R.id.btn_02)
    Button btn02;
    @BindView(R.id.btn_03)
    Button btn03;
    @BindView(R.id.iv_addphoto)
    ImageView ivAddphoto;
    @BindView(R.id.iv_delete)
    ImageView ivDelete;
    @BindView(R.id.good_content)
    EditText goodContent;
    @BindView(R.id.btn_submit)
    Button btnSubmit;

    public static final String Path = "http://image.fvideo.cn/uploadfile/2014/07/06/20140706151135878002.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgoods);
        ButterKnife.bind(this);
        title.setText("添加商品");
        goodRebatePrice.setEnabled(false);
        goodRebate.addTextChangedListener(goodRebateTextWatcher);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }
/**
 * 所有按钮的点击事件
 * */
    @SuppressLint("ResourceAsColor")
    @OnClick({R.id.btn_01, R.id.btn_02, R.id.btn_03, R.id.iv_addphoto, R.id.iv_delete, R.id.btn_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                getLabelReak();
                btn01.setBackgroundColor(R.color.text_color16);
                break;
            case R.id.btn_02:
                getLableQrcode();
                btn02.setBackgroundColor(R.color.text_color16);
                break;
            case R.id.btn_03:
                getLableQrefund();
                btn03.setBackgroundColor(R.color.text_color16);
                break;
            case R.id.iv_addphoto:
                ivAddphoto.setImageResource(R.mipmap.pic_01);
                break;
            case R.id.iv_delete:
                ivAddphoto.setImageResource(R.mipmap.btn_add);
                break;
            case R.id.btn_submit:
                AddGoodsPresenter addGoodsPresenter = new AddGoodsPresenter(this);
                addGoodsPresenter.submit();
                break;
        }
    }

    @Override
    public String getGoodsName() {
        return goodName.getText().toString().trim();
    }

    @Override
    public Double getGoodsPrice() {
        String goodsPrice = goodPrice.getText().toString().trim();

        return "".equals(goodsPrice) ? 0 : Double.valueOf(goodsPrice);
    }

    @Override
    public Double getGoodsSale() {
        String goodsSale = goodRebate.getText().toString().trim();
        return "".equals(goodsSale) ? 0 : Double.valueOf(goodsSale);
    }

    @Override
    public Double getGoodsSalePrice() {
     Double goodRebatePric=getGoodsPrice() * (getGoodsSale() / 10);
     goodRebatePrice.setText(String.valueOf(goodRebatePric));
        return Double.valueOf(goodRebatePrice.getText().toString().trim());

    }

    @Override
    public String getGoodIntro() {
        return goodContent.getText().toString().trim();
    }

    @Override
    public String getGoodPic() {


        return Path;

    }

    @Override
    public String getLabelReak() {

        return "正品保障";
    }

    @Override
    public String getLableQrcode() {
        return "扫码验真";
    }

    @Override
    public String getLableQrefund() {
        return "支持七天退货";
    }
/**
 * 添加商品成功后跳转到商品列表
 * */
    @Override
    public void goGoodList() {
        Intent intent = new Intent(this, GoodsActivity.class);
        startActivity(intent);
        finish();

    }
/**折扣输入框监听事件
 *
 */
    TextWatcher goodRebateTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() == 0) {
                goodRebatePrice.setText("");
            } else {
                getGoodsSalePrice();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
