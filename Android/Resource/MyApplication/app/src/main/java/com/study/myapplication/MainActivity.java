package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // drawble 우리가 사용할 이미지들을 넣는곳
        // app에서 사용될 아이콘 폴더
        // ViewComponent view 동적으로 다루기

        // xml
        // ViewComponent 가져와서 변수로 넣기
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        // xml의 뷰 컴포넌트를 동적으로 변경하는 방법

        // 사진바꾸기
        imageView.setImageResource(R.drawable.js1);

        // 글 변경
        textView.setText("안녕하세요");

        // Resource에서 가져오기
        String content = getApplicationContext().getResources().getString(R.string.CONTENT);
        textView.setText(content);

        //res 정의된 string_Array 가져오는 방법
        getApplicationContext().getResources().getStringArray(R.array.string_array);
        Log.d("string_array", getApplicationContext().getResources().getStringArray(R.array.string_array)[1]);
    }
}
