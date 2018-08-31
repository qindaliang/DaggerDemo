package com.qin.daggerdemo.demo4;

import android.app.Activity;

import com.qin.daggerdemo.demo1.OneActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CatModule {


    @Provides
    Cat providerCat(){
       return new Cat();
    }

}
