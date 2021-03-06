package com.qin.daggerdemo.demo6;


import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    public MainModule() {
    }

    @PreActivity
    @Provides
    @RedCloth

    Cloth providerRedColor(){
        return new Cloth("红色");
    }

    @Provides
    @BlueCloth
    Cloth providerBlueColor(){
        return new Cloth("蓝色");
    }

    @Provides
    @Named("red")
    Clothes providerRedClothes(@RedCloth Cloth cloth){
        return new Clothes(cloth);
    }

    @Provides
    @Named("Blue")
    Clothes providerBlueClothes(@BlueCloth Cloth cloth){
        return new Clothes(cloth);
    }

//    @Provides
//    ClothesHolder providerClothesHolder(){
//        return new ClothesHolder();
//    }
}
