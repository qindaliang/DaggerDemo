package com.qin.daggerdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.qin.daggerdemo.demo1.OneActivity;
import com.qin.daggerdemo.demo1.bean.Student;
import com.qin.daggerdemo.demo1.component.DaggerStudentComponent;
import com.qin.daggerdemo.demo1.module.StudentModule;
import com.qin.daggerdemo.demo2.TwoActivity;
import com.qin.daggerdemo.demo3.ThreeActivity;
import com.qin.daggerdemo.demo4.FourActivityActivity;
import com.qin.daggerdemo.demo5.FiveActivity;
import com.qin.daggerdemo.demo6.SixActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(view ->
                startActivity(new Intent(this, OneActivity.class)));
        findViewById(R.id.btn2).setOnClickListener(view ->
                startActivity(new Intent(this, TwoActivity.class)));
        findViewById(R.id.btn3).setOnClickListener(view ->
                startActivity(new Intent(this, ThreeActivity.class)));
        findViewById(R.id.btn4).setOnClickListener(view ->
                startActivity(new Intent(this, FourActivityActivity.class)));
        findViewById(R.id.btn5).setOnClickListener(view ->
                startActivity(new Intent(this, FiveActivity.class)));
        findViewById(R.id.btn6).setOnClickListener(view ->
                startActivity(new Intent(this, SixActivity.class)));
    }
}
