package com.qin.daggerdemo.demo6;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = MainModule.class,dependencies = BaseComponent.class)
@PreActivity
public interface MainComponent {
    void inject(SixActivity activity);
}
