package com.yceshop_admin.utils;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yceshop_admin.R;

/**
 * 图片显示工具类
 * GlideUtils
 *
 * @author tianshi
 * @time 2018/5/15
 */

public class GlideUtils {
    /**
     * 加载图片
     *
     * @param activity
     * @param imageUrl
     * @param imageView
     */
    public void showImage(Activity activity, String imageUrl, ImageView imageView) {
        try {
            Glide.with(activity)
                    .load(imageUrl)
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .dontAnimate()
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher_round)
                    .into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载本地图片
     *
     * @param activity
     * @param resourceId
     * @param imageView
     */
    public void showImage(Activity activity, Integer resourceId, ImageView imageView) {
        try {
            Glide.with(activity)
                    .load(resourceId)
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .dontAnimate()
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher_round)
                    .into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
