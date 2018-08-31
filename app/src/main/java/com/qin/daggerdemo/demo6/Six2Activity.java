package com.qin.daggerdemo.demo6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.qin.daggerdemo.R;

import javax.inject.Inject;

public class Six2Activity extends AppCompatActivity {

    private TextView mTv2;
    @Inject
    ClothesHolder mClothesHolder;

    @Inject
    @RedCloth
    Cloth mRedCloth1;

    @Inject
    @BlueCloth
    Cloth mblueCloth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six2);
        mTv2 = findViewById(R.id.tv2);
//        DaggerMainComponent2.builder().mainModule2(new MainModule2()).build().inject(this);
////scop 作用域
//        mTv2.setText(mClothesHolder.createClothes(mRedCloth1).toString()+"mClothesHolder的地址： "+mClothesHolder);


       // DaggerMainComponent2.builder().baseComponent(ApplicationHolder.getBaseComponent()).mainModule2(new MainModule2()).build().inject(this);
        ApplicationHolder.getBaseComponent().getSubComponent(new MainModule2()).inject(this);
        mTv2.setText(mClothesHolder.createClothes(mblueCloth).toString()+"mClothesHolder的地址： "+mClothesHolder);
    }
}
