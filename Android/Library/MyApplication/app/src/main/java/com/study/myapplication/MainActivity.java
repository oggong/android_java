package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewOne;
    ImageView imageViewTwo;
    ImageView imageViewThree;
    ImageView imageViewFour;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //glide를 사용하면 웹에 있는 이미지를 가져올수 있다.
        context = this;
        imageViewOne = findViewById(R.id.image_one);
        imageViewTwo = findViewById(R.id.image_two);
        imageViewThree = findViewById(R.id.image_three);
        imageViewFour = findViewById(R.id.image_four);

        // 웹 이미지를 넣는 방법
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .into(imageViewOne);

        // option 사용 방법
        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context).load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(cropOption)
                .into(imageViewTwo);

        // 카카오 같은 앱을 사용하다보면 이미지를 동그랗게 하는 것 있음!! 그걸 해보자
        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context).load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(circleCrop)
                .into(imageViewThree);

        // 로컬 이미지 불러오는 방법
        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .into(imageViewFour);
    }
}
