package com.qin.daggerdemo.demo3;

import com.qin.daggerdemo.demo2.module.Animal;
import com.qin.daggerdemo.demo2.scop.ActivityScop;

import dagger.Module;
import dagger.Provides;

@Module
public class ThreeModule {

    private ThreeActivity mThreeActivity;

    public ThreeModule(ThreeActivity threeActivity) {
        mThreeActivity = threeActivity;
    }

    @Provides
    @ActivityScop
    Animal getAnimal(){
        return new Animal();
    }
}
