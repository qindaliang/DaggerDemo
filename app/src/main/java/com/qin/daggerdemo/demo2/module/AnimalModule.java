package com.qin.daggerdemo.demo2.module;

import com.qin.daggerdemo.demo2.TwoActivity;
import com.qin.daggerdemo.demo2.scop.ActivityScop;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AnimalModule {

    private TwoActivity mTwoActivity;


    public AnimalModule(TwoActivity twoActivity) {
        mTwoActivity = twoActivity;
    }

    @Provides
    @ActivityScop
    Animal getAnimal(){
        return  new Animal();
    }
}
