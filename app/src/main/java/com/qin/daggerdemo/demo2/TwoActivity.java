package com.qin.daggerdemo.demo2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.qin.daggerdemo.R;
import com.qin.daggerdemo.demo2.ComponentHolder.ComponentHolder;
import com.qin.daggerdemo.demo2.ComponentHolder.DaggerAnimalComponent;
import com.qin.daggerdemo.demo2.module.Animal;
import com.qin.daggerdemo.demo2.module.AnimalModule;
import com.qin.daggerdemo.demo3.ThreeActivity;

import javax.inject.Inject;

public class TwoActivity extends AppCompatActivity {

    @Inject
    Animal mAnimal1;
    @Inject
    Animal mAnimal2;
    @Inject
    SharedPreferences mSharedPreferences1;
    @Inject
    SharedPreferences mSharedPreferences2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        inJect();
        findViewById(R.id.btn_one).setOnClickListener((v) -> Toast.makeText(TwoActivity.this, mAnimal1.toString(), Toast.LENGTH_SHORT).show());
        findViewById(R.id.btn_two).setOnClickListener((v) -> Toast.makeText(TwoActivity.this, mAnimal2.toString(), Toast.LENGTH_SHORT).show());
        findViewById(R.id.btn_three).setOnClickListener((v) -> Toast.makeText(TwoActivity.this, mSharedPreferences1.toString(), Toast.LENGTH_SHORT).show());
        findViewById(R.id.btn_four).setOnClickListener((v) -> Toast.makeText(TwoActivity.this, mSharedPreferences2.toString(), Toast.LENGTH_SHORT).show());
        findViewById(R.id.btn_five).setOnClickListener((v) ->startActivity(new Intent(TwoActivity.this, ThreeActivity.class)));
    }

    public void inJect() {
        DaggerAnimalComponent.builder().appComponent(ComponentHolder.getAppComponent()).animalModule(new AnimalModule(this)).build().inject(this);
    }
}
