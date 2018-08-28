package com.qin.daggerdemo.demo2.module;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(){
        return mApplication.getSharedPreferences("config", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return mApplication;
    }
}
