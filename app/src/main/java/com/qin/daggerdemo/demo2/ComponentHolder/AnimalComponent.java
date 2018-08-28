package com.qin.daggerdemo.demo2.ComponentHolder;

import com.qin.daggerdemo.demo2.TwoActivity;
import com.qin.daggerdemo.demo2.component.AppComponent;
import com.qin.daggerdemo.demo2.module.AnimalModule;
import com.qin.daggerdemo.demo2.scop.ActivityScop;


import dagger.Component;
@ActivityScop
@Component(modules = AnimalModule.class,dependencies = AppComponent.class)
public interface AnimalComponent {
    void inject(TwoActivity activity);
}
