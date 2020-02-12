package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("AGAIN", false);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Stack ----> FLAG_ACTIVITY_CLEAR_TOP
        // M           M
        // T     ----> -
        // S           -
        // M           -

        // 약간의 문제점이 있음  M -> S -> T -> M 계속 무한
        // Second에서 가기전에 Main Activity에서 멈춤

        startActivity(intent);
    }
}
