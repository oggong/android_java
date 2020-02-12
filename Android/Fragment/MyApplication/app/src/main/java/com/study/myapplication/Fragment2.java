package com.study.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("lifecycle", "fragment two: onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment two: onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment two: onCreateView");
        return inflater.inflate(R.layout.fragment_two, container, false);
        // 이렇게도 가능
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("lifecycle", "fragment two: onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("lifecycle", "fragment two: onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifecycle", "fragment two: onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifecycle", "fragment two: onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifecycle", "fragment two: onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifecycle", "fragment two: onDetach");
        super.onDetach();
    }
}
