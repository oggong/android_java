package com.example.myapplication;

public class Mother extends Human {

    public Mother() {

    }

//    public void eat() {
//        System.out.println("먹는다");
//    }
//
//    public void sleep() {
//        System.out.println("잔다");
//    }
//
//    public void wash() {
//        System.out.println("씻는다");
//    }

    public void cook() {
        System.out.println("요리한다");
    }

    @Override
    public void eat() {
        System.out.println("적게 먹는다");
    }


}

