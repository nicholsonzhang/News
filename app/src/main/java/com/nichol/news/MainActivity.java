package com.nichol.news;


import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppBaseActivity {


    @BindView(R.id.hello)
    TextView tvHello;


    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
    }


    @Override
    protected void initData() {

    }


}
