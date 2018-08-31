package com.qin.daggerdemo.demo6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qin.daggerdemo.R;

import javax.inject.Inject;
import javax.inject.Named;

public class SixActivity extends AppCompatActivity {

    private TextView mTv;
    private TextView mTvAddress;
    private TextView mTvHolder;
    @Inject
    @RedCloth
    Cloth mRedCloth1;

    @Inject
    @RedCloth
    Cloth mRedCloth2;

    @Inject
    @BlueCloth
    Cloth mBlueCloth1;
    @Inject
    @BlueCloth
    Cloth mBlueCloth2;
    @Inject
    Shoe mShoe;
    @Inject
    @Named("red")
    Clothes mRedClothes;
    @Inject
    @Named("Blue")
    Clothes mBlueClothes;


    @Inject
    ClothesHolder mClothesHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
  //      DaggerMainComponent.builder().mainModule(new MainModule()).build().inject(this);
        DaggerMainComponent.builder().baseComponent(((MyApplication) getApplication()).getBaseComponent()).mainModule(new MainModule()).build().inject(this);
        mTv = findViewById(R.id.tv);
        mTvHolder = findViewById(R.id.tv_holder);
        findViewById(R.id.btn).setOnClickListener(v->{
            startActivity(new Intent(this,Six2Activity.class));
        });
        mTvAddress = findViewById(R.id.tv_address);
        mShoe.setName("鞋子");
        mTv.setText(mRedCloth1.getColor() + "  and  " + mRedClothes.toString() + "  and  " + mBlueCloth1.getColor() + "  and  " + mBlueClothes.toString());
        mTvAddress.setText("红色address1: " + mRedCloth1.toString() + "\n" +
                "红色address2: " + mRedCloth2.toString() + "\n" +
                "蓝色address1: " + mBlueCloth1.toString() + "\n" +
                "蓝色address2： " + mBlueCloth2.toString());


        /////scop 作用域,不同activity不共用同一个对象
 //       mTvHolder.setText(mClothesHolder.createClothes(mRedCloth1).toString()+"mClothesHolder的地址： "+mClothesHolder.toString());

        mTvHolder.setText(mClothesHolder.createClothes(mRedCloth1).toString()+"mClothesHolder的地址： "+mClothesHolder.toString());

    }
}
