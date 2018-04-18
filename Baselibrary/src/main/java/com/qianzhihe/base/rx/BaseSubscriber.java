package com.qianzhihe.base.rx;

import com.qianzhihe.base.presenter.view.IBaseView;

import rx.Subscriber;

public class BaseSubscriber<T> extends Subscriber<T> {

    private IBaseView mIBaseView;

    public BaseSubscriber(IBaseView mIBaseView) {
        this.mIBaseView = mIBaseView;
    }

    @Override
    public void onCompleted() {
        mIBaseView.hideLoading();
    }

    @Override
    public void onError(Throwable e) {
        mIBaseView.hideLoading();
        if (e instanceof BaseException){
            mIBaseView.onError(e.getMessage());
        }
    }

    @Override
    public void onNext(T t) {

    }
}
