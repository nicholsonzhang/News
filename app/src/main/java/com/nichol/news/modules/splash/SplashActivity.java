package com.nichol.news.modules.splash;


import com.nichol.news.AppBaseActivity;
import com.nichol.news.MainActivity;
import com.nichol.news.R;

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
