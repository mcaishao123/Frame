package com.qianzhihe.base.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.qianzhihe.base.injection.component.DaggerActivityComponent;
import com.qianzhihe.base.presenter.BasePresenter;
import com.qianzhihe.base.presenter.view.BaseView;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import javax.inject.Inject;


public abstract class BaseMvpActivity<T extends BasePresenter> extends RxAppCompatActivity implements BaseView {

    @Inject
    T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivityInjection();
        injectComponent();
    }

    protected  void initActivityInjection(){
        DaggerActivityComponent.builder().lifecycleProviderModule(this).build();
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
