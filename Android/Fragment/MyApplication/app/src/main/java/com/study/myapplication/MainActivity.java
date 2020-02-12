package com.study.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    Button button;

    // BUNDLE_KEY를 까먹기 잊어버리기 쉬움!!
    // 전역 변수로 설정을 해주면 기억하기 좋음
    public static final String BUNDLE_KEY = "bundle_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "Activity: onCreate");


        // 실습 강의4
        //MainActivity에서 fragment1 에게 번들을 사용해서 값을 보내도록! 하자
        Fragment fragmentOne = new Fragment1();

        // Bundle안에 값을 넣어주면 된다.
        Bundle bundle = new Bundle();
        // 자신이 넣어주고 싶은 데이터 타입 선택
        bundle.putInt(BUNDLE_KEY, 10); // KEY, VALUE 타입
        fragmentOne.setArguments(bundle);


        fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // 작업 1
        // 작업 2
        // 확인 이 될때 작업 1 2 진행
        //fragmentTransaction.add(R.id.container, new Fragment1());
        fragmentTransaction.add(R.id.container, fragmentOne); // --> 실습 4
        // 리소스 아이디와 프래그먼트1을 받음
        // xml의 id를 프래그먼트1로 add시켜줌
        fragmentTransaction.commit();
        // 확인 commit 해야 위에서 등록한 작업이 실행이 됨


        //Button을 눌러 fragment1을 fragment2로 교체
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 프래그먼트 트랜젝션을 만들엇다고 해서 다시 사용하면 안됨
                // 재사용 불가능 하니 다시 생성 해줘야 한다.
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new Fragment2());
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("lifecycle", "Activity: onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle", "Activity: onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle", "Activity: onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle", "Activity: onDestroy");
        super.onDestroy();
    }
}
