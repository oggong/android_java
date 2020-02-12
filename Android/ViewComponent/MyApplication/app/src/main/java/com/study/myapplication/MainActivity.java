package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // textVIew에 onClickListner 다는 방법

        textView = findViewById(R.id.textView);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });

        // 위를 풀어서 작성
        // 객체 생성후 바로 override

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        };
        textView.setOnClickListener(listener);


        editText = findViewById(R.id.editText);

        // 방식 1
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("beforeTextChanged", "s: " + charSequence);
                Log.d("beforeTextChanged", "s: " + i);
                Log.d("beforeTextChanged", "s: " + i1);
                Log.d("beforeTextChanged", "s: " + i2);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("onTextChanged", "s: " + charSequence);
                Log.d("onTextChanged", "s: " + i);
                Log.d("onTextChanged", "s: " + i1);
                Log.d("onTextChanged", "s: " + i2);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d("afterTextChanged", "s : " + editable);
            }
        });

        // 방식 2
//        TextWatcher textWatcher = new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        };
//        editText.addTextChangedListener(textWatcher);

    }
}
