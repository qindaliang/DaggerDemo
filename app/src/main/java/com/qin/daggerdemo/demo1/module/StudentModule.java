package com.qin.daggerdemo.demo1.module;


import com.qin.daggerdemo.MainActivity;
import com.qin.daggerdemo.demo1.OneActivity;
import com.qin.daggerdemo.demo1.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    private OneActivity mActivity;

    public StudentModule(OneActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    Student provideStudent(){
        return new Student();
    }
}
