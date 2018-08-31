package com.qin.daggerdemo.demo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;
import com.qin.daggerdemo.R;

import javax.inject.Inject;

public class FiveActivity extends AppCompatActivity {

    @Inject
    Animal mAnimal;
    @Inject
    Cat mCat;
    @Dog1
    @Inject
    Dog mDog1;
    @Dog2
    @Inject
    Dog mDog2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        DaggerAnimalComponent.builder().animalModule(new AnimalModule()).dogModule(new DogModule()).build().inject(this);
        Logger.i(mAnimal.toString());
        Logger.i(mCat.toString());
        Logger.i(mAnimal.show());
        Logger.i(mDog1.getName());
        Logger.i(mDog2.getName());
    }
}
