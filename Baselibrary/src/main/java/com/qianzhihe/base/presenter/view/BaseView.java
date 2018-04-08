package com.qianzhihe.base.presenter.view;

/*
   MVP中视图回调 基类
*/
public interface BaseView {

    void showLoading();

    void hideLoading();

    void onError(String text);

}
