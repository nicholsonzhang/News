package com.nichol.news;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class ZApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO
    }
}
