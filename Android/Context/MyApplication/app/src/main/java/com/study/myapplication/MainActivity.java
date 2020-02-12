package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;
        Context context2 = MainActivity.this; // 위와 같은 방식
        Context applicationContext = getApplicationContext(); // Application의 Context


        // Context에 미리 정의 되어있는것을 불러와 사용하는 것!!
//        startActivity();
//        startActivityForResult();
    }
}
