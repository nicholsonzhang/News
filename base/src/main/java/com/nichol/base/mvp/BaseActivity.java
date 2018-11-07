package com.nichol.base.mvp;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.res.Resources;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

import butterknife.ButterKnife;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getContentViewId() > 0) {
            setContentView(getContentViewId());
        }

        mPresenter = getPresenter();
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            initBundle(bundle);
        }
        initViews();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void showProgressUI(boolean show) {

    }


    protected T getPresenter() {
        return null;
    }


    protected void initBundle(Bundle bundle) {

    }

    protected abstract int getContentViewId();

    protected abstract void initViews();

    protected abstract void initData();//请求网络数据

    public void launchActivity(Class<? extends Activity> target, Bundle... bundles) {
        Intent intent = new Intent(this, target);
        if (bundles != null && bundles.length > 0) {
            intent.putExtras(bundles[0]);
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }

}
