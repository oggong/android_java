package com.study.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle", "onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("LifeCycle", "onRestart");
        super.onRestart();
    }

}
