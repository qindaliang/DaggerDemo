package com.qin.daggerdemo.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.qin.daggerdemo.LogUtils;
import com.qin.daggerdemo.R;
import com.qin.daggerdemo.demo1.bean.Student;
import com.qin.daggerdemo.demo1.component.DaggerStudentComponent;
import com.qin.daggerdemo.demo1.module.StudentModule;
import com.qin.daggerdemo.demo4.Cat;
import com.qin.daggerdemo.demo4.CatModule;
import com.qin.daggerdemo.demo4.DaggerCatComponent;

import javax.inject.Inject;

public class OneActivity extends AppCompatActivity {

    @Inject
    Student mStudent;

    @Inject
    Cat mCat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        Button btn_one = findViewById(R.id.btn_one);
        DaggerStudentComponent.builder().studentModule(new StudentModule(this)).catModule(new CatModule()).build().inject(this);


        btn_one.setOnClickListener(v -> {
            Toast.makeText(OneActivity.this, mStudent.toString(), Toast.LENGTH_SHORT).show();
//            Logger.d(mStudent);
////            Logger.d("sdfsdfsdfsdfsdf");
            Log.i("msg", "sdfsdfsdfsdfsdf");
            LogUtils.i(mStudent.toString());
            LogUtils.i(mCat.toString());
            LogUtils.createMessage(mStudent.toString());
            LogUtils.log2File("verbose", "msg", mStudent.toString());
        });
    }
}
