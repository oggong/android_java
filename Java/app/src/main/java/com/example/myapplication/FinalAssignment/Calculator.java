package com.example.myapplication.FinalAssignment;

public class Calculator implements Calculator_Interface {

    // 빈 생성자
    public Calculator() {

    }

    @Override
    public int sum(int first, int second) {
        return first + second;
    }

    @Override
    public int minus(int first, int second) {
        return first - second;
    }
}
