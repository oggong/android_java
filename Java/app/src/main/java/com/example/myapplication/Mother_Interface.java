package com.example.myapplication;

public class Mother_Interface implements Human_Interface {

    @Override
    public void eat() {
        System.out.println("엄마가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("엄마가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("엄마가 씻는다");
    }
}
