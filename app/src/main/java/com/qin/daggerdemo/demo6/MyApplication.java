package com.qin.daggerdemo.demo6;

import android.app.Application;

public class MyApplication extends Application {

    private BaseComponent mBaseComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule(this)).build();
        ApplicationHolder.setBaseComponent(mBaseComponent);
    }

    public BaseComponent getBaseComponent(){
        return mBaseComponent;
    }
}
