package com.qianzhihe.base.injection.component;

import com.qianzhihe.base.injection.ActivityScoped;
import com.qianzhihe.base.injection.module.LifecycleProviderModule;
import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Component;

@ActivityScoped
@Component(modules = {LifecycleProviderModule.class})
interface ActivityComponent {

    LifecycleProvider lifecycleProvider();
}
