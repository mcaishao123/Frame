package com.qianzhihe.base.common;

import android.app.Application;
import android.content.Context;


public class BaseApplication extends Application {

    private static BaseApplication context;

    public static BaseApplication getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
