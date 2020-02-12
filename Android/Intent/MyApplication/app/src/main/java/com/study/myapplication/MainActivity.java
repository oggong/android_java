package com.study.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "1 : onCreate");
        setContentView(R.layout.activity_main);


        // 명시적 인텐트 사용
        Intent intent = new Intent(this, SecondActivity.class);
        //첫번째 파라미터에서 두번째 파라미터로 이동 ,, this는 MainActivity를 의미한다.
        intent.putExtra("INTENT_KEY", 5);
        intent.putExtra("INTENT_KEY_STRING", "STRING");
        startActivityForResult(intent, REQUEST_CODE); // 다시 DATA 받기

        // 암시적 인텐트
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
//        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE) {

            // resultCode는 요약본
            if (resultCode == 200) { // 데이터가 잘 전달되었다.
                String result = data.getStringExtra("RESULT");
                Log.d("onActivityResult","result : " + result);
            } else if(resultCode == 300) {
                Log.d("onActivityResult","실패");
            } // 잘 전달되지 못하였다.
        }
    }

    @Override
    protected void onStart() {
        Log.d("lifecycle", "1 : onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle", "1 : onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle", "1 : onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifecycle", "1 : onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle", "1 : onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifecycle", "onRestart");
        super.onRestart();
    }
}
