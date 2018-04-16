package com.qianzhihe.base.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.qianzhihe.base.presenter.BasePresenter;
import com.qianzhihe.base.presenter.view.BaseView;

import javax.inject.Inject;


public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements BaseView {

    @Inject
    private T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectComponent();
    }

    protected abstract void injectComponent();

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(String text) {

    }
}
