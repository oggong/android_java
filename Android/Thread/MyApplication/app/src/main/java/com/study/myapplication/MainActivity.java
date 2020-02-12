package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 어플리케이션 실행 시작 부분

        //스레드 생성방법 1번 ---> 객체를 인스턴스화 시키고 인스턴스화한 객체를 변수에 넣어두는 이유
        //계속적으로 변수에 작업을 하고 싶을때 이렇게 만든다
        // ex Intent intent = new Intent(this, MainActivity.class);
        //    startActivity();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//            }
//        };
//        Thread thread = new Thread(runnable);
//          thread.start();


        // 스레드 생성방법 2번
        // 여러번 작업할 필요가 없는 경우
        new Thread(new Runnable() {
            @Override
            public void run() {
//                Log.d("runnable", "1");
//                Toast.makeText(MainActivity.this, "토스트", Toast.LENGTH_LONG).show();
            }
        }).start();

        // UI 스레드 만드는 방법
        // 생성과 동시에 시작되기때문에 start() 지원 하지 않음.
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "토스트", Toast.LENGTH_LONG).show();
            }
        });
    }
}
