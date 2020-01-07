package com.example.myapplication;

public class Array {

    public static void main(String[] args) {

//        배열 만들기 (boolean 배열)
        boolean[] booleans = new boolean[4]; // 명시적 배열 크기 지정

//        배열 만들기 (크기 4 인 int 배열)
        int[] ints = new int[4]; // 명시적 배열 크기 지정


//        배열의 요소를 넣어주고 배열의 요소만큼 배열의 크기 지정
        boolean[] booleans2 = {true, false, true, false};
        System.out.println(booleans2);


//        배열에 값을 넣는 방법
        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = false;
        booleans[3] = true;

//        배열에서 값을 꺼내오는 방법

        int[] ints1 = {1, 2, 3, 4};

        int first = ints1[0];
        int second = ints1[1];
        int third = ints1[2];
        int fourth = ints1[3];

        System.out.println(first);

//      반복 제어문
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i] == true) {
                System.out.println("참");
            } else {
                System.out.println("거짓");
            }
        }


        for (int i = 0; i < ints1.length; i++) {

            if (ints1[i] == 1) {
                System.out.println("1 발견");
            } else if (ints1[i] == 2) {
                System.out.println("2 발견");
            } else {
                System.out.println("모르는 수 발견!");
            }

        }

    }

}
