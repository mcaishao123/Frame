package com.qianzhihe.base.injection.module;

import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhengmc on 2018/4/17.
 */

@Module
public class LifecycleProviderModule {

    private LifecycleProvider lifecycleProvider;

    public LifecycleProviderModule(LifecycleProvider lifecycleProvider) {
        this.lifecycleProvider = lifecycleProvider;
    }

    @Provides
    LifecycleProvider provideLifecycleProvider() {
        return lifecycleProvider;
    }

}
