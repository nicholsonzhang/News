package com.nichol.news;


public class SplashActivity extends AppBaseActivity {
    @Override
    protected int getContentViewId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initViews() {


    }

    @Override
    protected void initData() {
        launchActivity(MainActivity.class);
        finish();

    }
}
