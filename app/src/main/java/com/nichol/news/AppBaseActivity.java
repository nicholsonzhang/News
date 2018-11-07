package com.nichol.news;

import com.nichol.base.mvp.BaseActivity;
import com.nichol.base.mvp.BasePresenter;

/**
 * 基类，与业务有关
 */
public abstract class AppBaseActivity<T extends BasePresenter> extends BaseActivity<T> {
}
