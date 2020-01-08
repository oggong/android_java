package com.example.myapplication;

public class Calculator_Real implements Caculator_Interface {

    // alt + insert -> implements method
    // 이 안에서 진짜 구현
    @Override
    public void sum() {
        System.out.println("더하기");
    }

    @Override
    public void minus() {
        System.out.println("빼기");
    }

    @Override
    public void by() {
        System.out.println("나누기");
    }

    @Override
    public void multiple() {
        System.out.println("곱하기");
    }
}
