package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> stringList;
    LayoutInflater layoutInflater;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList = new ArrayList();
        stringList.add("가");
        stringList.add("나");
        stringList.add("다");
        stringList.add("라");
        stringList.add("마");
        stringList.add("바");
        stringList.add("사");
        stringList.add("아");

        container = findViewById(R.id.container);

        layoutInflater = LayoutInflater.from(MainActivity.this);

        for (int i = 0; i < stringList.size(); i++) {
            View view = layoutInflater.inflate(R.layout.list_item_view, null, false);
            TextView itemText = view.findViewById(R.id.item_view_text);
            // 해당컴포넌트를 찾아와서 텍스트 뷰에 넣어줌
            // view 안에 있는 item_view_text를 가지고 오겠다.

            itemText.setText(stringList.get(i));
            // setText로 글씨를 써줌

            //setOnClickListener addView 하기전에 리스트를 버튼으로 만들기
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("test", "CLICK!!!");
                }
            });

            //위에서 만든 view를 layout에 붙여줌!
            container.addView(view);
        }


    }
}
