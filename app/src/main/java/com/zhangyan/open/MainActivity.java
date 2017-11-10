package com.zhangyan.open;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyan.mylibrary.Demo;
import com.zhangyan.mylibrary.TestActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Demo demo = new Demo();
        demo.add(1.1, 1.1);
        Intent intent = new Intent();
        intent.setClass(this, TestActivity.class);
        startActivity(intent);
        finish();
    }
}
