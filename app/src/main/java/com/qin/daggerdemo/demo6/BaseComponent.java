package com.qin.daggerdemo.demo6;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = BaseModule.class)
@Singleton
public interface BaseComponent {
    Application getApplication();
    ClothesHolder getClothesHolder();
    SubComponent2 getSubComponent(MainModule2 mainModule2);
}
