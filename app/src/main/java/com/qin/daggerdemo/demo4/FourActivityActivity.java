package com.qin.daggerdemo.demo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;
import com.qin.daggerdemo.R;

import javax.inject.Inject;

public class FourActivityActivity extends AppCompatActivity {

    @Inject
    Cat mCat;
    @Inject
    Cat mCat1;
    @Inject
    Dog mDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_activity);
        //depend on
        DaggerCatComponent.builder().catModule(new CatModule()).build().inject(this);
        Logger.i(mCat.toString());
        Logger.i(mCat1.toString());  Logger.i(mDog.toString());
    }
}
