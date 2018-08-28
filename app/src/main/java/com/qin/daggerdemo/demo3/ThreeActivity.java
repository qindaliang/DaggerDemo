package com.qin.daggerdemo.demo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.qin.daggerdemo.R;
import com.qin.daggerdemo.demo2.ComponentHolder.ComponentHolder;
import com.qin.daggerdemo.demo2.ComponentHolder.DaggerAnimalComponent;
import com.qin.daggerdemo.demo2.module.Animal;

import javax.inject.Inject;

public class ThreeActivity extends AppCompatActivity{

    @Inject
    Animal mAnimal1;
    @Inject
    Animal mAnimal2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        DaggerThreeComponent.builder().threeModule(new ThreeModule(this)).build().inject(this);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        tv1.setText(mAnimal1.toString());
        tv2.setText(mAnimal2.toString());
    }
}
