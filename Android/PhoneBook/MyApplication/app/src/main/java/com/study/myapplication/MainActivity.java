package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PhoneBook> phoneBookList;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        PhoneBook phoneBook1 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동1", "010-1111-1111");
        PhoneBook phoneBook2 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동2", "010-1111-1112");
        PhoneBook phoneBook3 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동3", "010-1111-1113");
        PhoneBook phoneBook4 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동4", "010-1111-1114");
        PhoneBook phoneBook5 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동5", "010-1111-1115");
        PhoneBook phoneBook6 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동6", "010-1111-1116");
        PhoneBook phoneBook7 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동7", "010-1111-1117");
        PhoneBook phoneBook8 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동8", "010-1111-1118");
        PhoneBook phoneBook9 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동9", "010-1111-1119");
        PhoneBook phoneBook10 = new PhoneBook("https://laftelimage.blob.core.windows" +
                ".net/items/thumbs/large/f3203d2d-13e7-43fc-afb0-a43a9a5fe56b.jpg", "홍길동10", "010-1111-1122");

        // 배열 생성
        phoneBookList = new ArrayList<>();
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
        phoneBookList.add(phoneBook4);
        phoneBookList.add(phoneBook5);
        phoneBookList.add(phoneBook6);
        phoneBookList.add(phoneBook7);
        phoneBookList.add(phoneBook8);
        phoneBookList.add(phoneBook9);
        phoneBookList.add(phoneBook10);


        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        for (int i = 0; i < phoneBookList.size(); i++) {

            // AddView 비효율성 체크
            Log.d("test", "inflate");

            View view = layoutInflater.inflate(R.layout.phonebook_item_view, null, false);
            TextView name = view.findViewById(R.id.name);
            TextView number = view.findViewById(R.id.number);
            ImageView imageView = view.findViewById(R.id.imageView);

            name.setText(phoneBookList.get(i).name);
            number.setText(phoneBookList.get(i).number);

            //Glide 추가
            RequestOptions circleOption = new RequestOptions().circleCrop();
            Glide.with(MainActivity.this)
                    .load(phoneBookList.get(i).image)
                    .apply(circleOption)
                    .into(imageView);

            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    String number = phoneBookList.get(finalI).number;
//                    Log.d("test","number :" + number);
                    Log.d("test", "number :" + phoneBookList.get(finalI).number);
                    // i번째가 final 되는 이유는 계속 변하기 때문 innerClass 에서 접근하기때문에 final로 접근해야 한다.

                }
            });

            container.addView(view);
        }
        Log.d("test", "inflate completed");


    }
}
