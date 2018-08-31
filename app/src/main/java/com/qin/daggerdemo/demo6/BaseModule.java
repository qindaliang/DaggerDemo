package com.qin.daggerdemo.demo6;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {

    private Application mApplication;

    public BaseModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return mApplication;
    }

    @Singleton
    @Provides
    ClothesHolder providerClothesHolder(){
        return new ClothesHolder();
    }
}
