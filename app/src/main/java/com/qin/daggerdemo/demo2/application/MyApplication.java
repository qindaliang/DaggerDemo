package com.qin.daggerdemo.demo2.application;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.qin.daggerdemo.LogUtils;
import com.qin.daggerdemo.demo2.ComponentHolder.ComponentHolder;
import com.qin.daggerdemo.demo2.component.DaggerAppComponent;
import com.qin.daggerdemo.demo2.module.AppModule;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inJect();
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)
                .methodCount(3)
                .methodOffset(0)
                .tag("PRETTY_LOGGER")
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        LogUtils.init(this);
    }

    public void inJect() {
        ComponentHolder.setAppComponent(DaggerAppComponent.builder().appModule(new AppModule(this)).build());
    }

}
