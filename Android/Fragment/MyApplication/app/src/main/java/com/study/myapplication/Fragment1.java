package com.study.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.study.myapplication.MainActivity.BUNDLE_KEY;

public class Fragment1 extends Fragment {

    View view; // 전역 변수 설정


    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("lifecycle", "fragment one: onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment one: onCreate");
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment one: onCreateView");
        //inflater == view를 그리는 역할
        view = inflater.inflate(R.layout.fragment_one, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment one: onActivityCreated");

        //번들을 꺼낼때는 이런방식으로!!
        int number = getArguments().getInt(BUNDLE_KEY);
        // MainActivity에서 설정한 BUNDLE_KEY를 불러오기
        Log.d("test", "number : " + number);

        // KEY VALUE 식으로 FRAGMENT 값을 주고 받을 수 있음 

        // onClick 등 기능 이용하려면 여기서 해주는 것이 좋다.
        Button button = view.findViewById(R.id.fragement_one_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test", "CLICK!!!!");
            }
        });

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("lifecycle", "fragment one: onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifecycle", "fragment one: onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifecycle", "fragment one: onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifecycle", "fragment one: onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifecycle", "fragment two: onDetach");
        super.onDetach();
    }
}
