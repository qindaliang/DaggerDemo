package com.qin.daggerdemo.demo6;

import dagger.Component;

@PreActivity
@Component(modules = MainModule2.class, dependencies = BaseComponent.class)

public interface MainComponent2 {
    void inject(Six2Activity activity);
}
