package com.qin.daggerdemo.demo6;

import android.app.Application;

public class ApplicationHolder {
    public static BaseComponent getBaseComponent() {
        return baseComponent;
    }

    public static void setBaseComponent(BaseComponent baseComponent) {
        ApplicationHolder.baseComponent = baseComponent;
    }

    static BaseComponent baseComponent;

    public ApplicationHolder() {
    }
}
