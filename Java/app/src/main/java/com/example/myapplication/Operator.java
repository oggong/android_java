package com.example.myapplication;

public class Operator {

    public static void main(String[] args) {

        int a;
        a = 10 % 2;

//        System.out.println(a); // 0

//        대입 연산자
        a = 5;
//        5 = a; // xxxxxxx

//        복합 대입 연산자
        int b = 5;
        b += 5;

//        System.out.println(b); // 10

        b %= 5;

//        System.out.println(b); // 0

//        증감 연산자
        int c = 5;
        int d;
        d = c++;

//        System.out.println(d); // 5

        int e = 5;
        int f;
        f = --e;

//        System.out.println(f); // 4

//        비교 연산자
        int g = 10;
        int h = 5;

        boolean result;

        result = g > h;

//        System.out.println(result); // true

        boolean fact1 = true;
        boolean fact2 = false;
        boolean result2;

        result2 = fact1 == fact2;

//        System.out.println(result2); // false

        result2 = fact1 != fact2;
//        System.out.println(result2); // true

//        논리 연산자
        result2 = fact1 && fact2;
//        System.out.println(result2); // false

        result2 = fact1 || fact2;
//        System.out.println(result2); // true

        result2 = !fact1;
//        System.out.print(result2); // false

    }
}
