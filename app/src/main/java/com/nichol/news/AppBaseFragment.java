package com.nichol.news;

import com.nichol.base.mvp.BaseFragment;
import com.nichol.base.mvp.BasePresenter;

/**
 * 基类，与业务有关
 */
public abstract class AppBaseFragment<T extends BasePresenter> extends BaseFragment<T> {
}
