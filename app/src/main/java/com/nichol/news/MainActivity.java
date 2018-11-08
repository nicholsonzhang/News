package com.nichol.news;


import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.nichol.news.imageloader.ImageLoader;

import butterknife.BindView;

public class MainActivity extends AppBaseActivity {


    @BindView(R.id.show_image)
    ImageView ivShow;


    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

        ImageLoader.get().loadRound(this,"http://h.hiphotos.baidu.com/image/h%3D300/sign=5573dd5fbede9c82b965ff8f5c8180d2/d1160924ab18972b132c39acebcd7b899e510a45.jpg",ivShow);
    }


    @Override
    protected void initData() {

    }


}
