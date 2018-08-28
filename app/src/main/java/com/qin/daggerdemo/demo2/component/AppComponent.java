package com.qin.daggerdemo.demo2.component;


import android.app.Application;
import android.content.SharedPreferences;

import com.qin.daggerdemo.demo2.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    SharedPreferences initSharePreferences();
    Application getApplication();
}
