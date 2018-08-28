package com.qin.daggerdemo.demo2.ComponentHolder;

import com.qin.daggerdemo.demo2.component.AppComponent;

public class ComponentHolder {

    static AppComponent mAppComponent;

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static void setAppComponent(AppComponent appComponent) {
        mAppComponent = appComponent;
    }
}
