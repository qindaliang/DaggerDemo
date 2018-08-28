package com.qin.daggerdemo.demo3;

import com.qin.daggerdemo.demo2.scop.ActivityScop;

import dagger.Component;

@ActivityScop
@Component(modules = ThreeModule.class)
public interface ThreeComponent {
    void inject(ThreeActivity activity);
}
