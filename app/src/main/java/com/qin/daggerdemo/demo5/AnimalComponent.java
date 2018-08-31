package com.qin.daggerdemo.demo5;

import dagger.Component;

@Component(modules = {AnimalModule.class,DogModule.class})
public interface AnimalComponent {
    void inject(FiveActivity activity);
}
