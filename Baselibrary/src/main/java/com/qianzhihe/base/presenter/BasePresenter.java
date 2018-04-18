package com.qianzhihe.base.presenter;

import com.qianzhihe.base.presenter.view.IBaseView;

public class BasePresenter<T extends IBaseView> {

    private T mView;

}
