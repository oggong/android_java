package com.study.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.JsonObject;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    // Stetho Debugging address
    // chrome://inspect/#devices

    TextView textView1;
    TextView textView2;
    MyService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Stetho 초기화
        Stetho.initializeWithDefaults(this);

        // Stetho 를 집어 넣어서 retrofit이 어떤식으로 request, response 를 쓰는지
        // 낚아 채서 보여준다.

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();
        // 네트워크를 낚아 채는것으로 Stetho를 넣음

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // 원하는 json을 클래스로

        service = retrofit.create(MyService.class);
        // 인터페이스 객체화

        textView1 = findViewById(R.id.text1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestUserRepo();
            }
        });

        textView2 = findViewById(R.id.text2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postUser();
            }
        });

    }

    public void postUser() {
        Call<JsonObject> postUser = service.postUser("changja88", 20);
        postUser.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }

    public void requestUserRepo() {
        Call<JsonObject> requestUserRepo = service.getUserRepositories("changja88");
        // 통신 한번 보낼 준비가 완료됨

        // 통신 보내기
        // 통신을 메인스레드에서 작동시키게 되면 메인스레드가 멈추게됨 = 그렇게 하면 오류
        // 비동기 방식을 사용하여 해야함.
        // Thread 만들어서 사용!
        requestUserRepo.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}
