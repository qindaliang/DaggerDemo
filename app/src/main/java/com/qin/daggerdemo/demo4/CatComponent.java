package com.qin.daggerdemo.demo4;

import com.qin.daggerdemo.demo1.OneActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = CatModule.class)
public interface CatComponent {
    void inject (FourActivityActivity activity);
}
