package com.qin.daggerdemo.demo5;

import dagger.Module;
import dagger.Provides;

@Module
public class DogModule {

    @Dog1
    @Provides
    Dog providerDog1() {
        return new Dog("dog1");
    }

    @Dog2
    @Provides
    Dog providerDog2() {
        return new Dog("dog2");
    }
}
