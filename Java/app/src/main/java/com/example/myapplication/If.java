package com.example.myapplication;

public class If {

    public static void main(String[] args) {

//        특정 조건을 만족하는 경우에만 실행
//        int money = 10000;

//        if (money >= 10000) {
//            System.out.println("돈가스를 먹는다");
//        }
//        true = "돈가스를 먹는다"

// ==================================================

        int money = 5000;

        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else {
            System.out.println("국밥을 먹는다");
        }
//    false 국밥을 먹는다

// ==================================================
        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else if (money >= 5000) {
            System.out.println("국밥을 먹는다");
        } else {
            System.out.println("라면을 먹는다");
        }
//        국밥을 먹는다

// ==================================================

    }

}
