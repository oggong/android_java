package com.example.myapplication;

public class Father_Interface implements Human_Interface {

    // 특정 메소드를 구현 해야 한다
    // alt + insert -> implements method

    @Override
    public void eat() {
        System.out.println("아버지 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("아버지가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("아버지가 씻는다");
    }
    // 작성이 인터페이스에 강제되고 있음을 확인할수 있다.
}
