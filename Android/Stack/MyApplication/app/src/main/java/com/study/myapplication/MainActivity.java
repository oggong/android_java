package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Main 실행 후 true로 되어 intent 실행 하지만 Third 실행 이후 false로 바뀌어 Main으로 돌아와도 다시 실행되지 않는다.

        Intent comingIntent = getIntent();
        boolean again = comingIntent.getBooleanExtra("AGAIN", true);

        if (again == true) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
