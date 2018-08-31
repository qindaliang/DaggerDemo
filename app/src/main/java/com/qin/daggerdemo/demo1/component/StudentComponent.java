package com.qin.daggerdemo.demo1.component;

import android.app.Activity;

import com.qin.daggerdemo.MainActivity;
import com.qin.daggerdemo.demo1.OneActivity;
import com.qin.daggerdemo.demo1.module.StudentModule;
import com.qin.daggerdemo.demo4.CatModule;

import dagger.Component;

@Component(modules = {StudentModule.class, CatModule.class})
public interface StudentComponent {

    void inject(OneActivity activity);
}
