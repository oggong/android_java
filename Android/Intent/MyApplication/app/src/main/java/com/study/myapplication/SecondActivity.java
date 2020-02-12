package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "2 : onCreate");
        setContentView(R.layout.activity_second);

//        Intent intent = getIntent();
////        String data = intent.getStringExtra("INTENT_KEY"); //String 으로 받아서 에러
//        int data = intent.getIntExtra("INTENT_KEY", 0);
//        String stringData = intent.getStringExtra("INTENT_KEY_STRING");
//        Log.d("intent_key", "" + data); // toString 안하고 이렇게 사용
//        Log.d("intent_key","" + stringData);

        // 작업 마친 후....
        Intent intent = new Intent();
        intent.putExtra("RESULT", "성공");
        setResult(200, intent);
        finish();

    }

    @Override
    protected void onStart() {
        Log.d("lifecycle", "2 : onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle", "2 : onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle", "2 : onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifecycle", "2 : onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle", "2 : onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifecycle", "2 : onRestart");
        super.onRestart();
    }

}
