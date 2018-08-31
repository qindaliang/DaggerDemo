package com.qin.daggerdemo.demo5;

import dagger.Module;
import dagger.Provides;

@Module
public class AnimalModule {

    @Provides
    Animal providerAnimal(Cat cat) {
        return new Animal(cat);
    }

}
