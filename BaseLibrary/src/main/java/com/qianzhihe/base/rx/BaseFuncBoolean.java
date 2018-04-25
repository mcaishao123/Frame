package com.qianzhihe.base.rx;

import com.qianzhihe.base.common.ResultCode;
import com.qianzhihe.base.data.protocol.BaseResp;

import rx.Observable;
import rx.functions.Func1;

public class BaseFuncBoolean<T> implements Func1<BaseResp<T>, Observable<Boolean>> {

    @Override
    public Observable<Boolean> call(BaseResp<T> tBaseResp) {
        if (tBaseResp.getStatus() != ResultCode.SUCCESS) {
            return Observable.error(new BaseException(tBaseResp.getStatus(), tBaseResp.getMessage()));
        }
        return Observable.just(true);
    }

}
