package com.qin.daggerdemo.demo6;


import dagger.Subcomponent;

@PreActivity
@Subcomponent(modules = MainModule2.class)
public interface SubComponent2 {
    void inject(Six2Activity activity);
}
