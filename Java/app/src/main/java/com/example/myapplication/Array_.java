package com.example.myapplication;

import java.util.ArrayList;

public class Array_ {

    public static void main(String[] args) {

//        1. 명시적으로 자료형을 적어 리스트를 만들기
//        reference 형 자료형이 들어올 수 있다.

//        int a;
//        Integer a; 둘의 차이

//        boolean b;
//        Boolean b2;

//        long c;
//        Long c1;

//        reference Type에는 Null 가능

//        Long item;
//        item = null;

//        ArrayList<Integer> ints = new ArrayList<Integer>();
          ArrayList<Integer> ints = new ArrayList<>();
          // 자료형을 적었기 때문에 자료형이 틀리면 에러

          ArrayList ints2 = new ArrayList();
          // 자료형 명시 해주지 않았기 때문에 에러 나지 않음

          ints.add(2);
          ints.add(3);

          System.out.println(ints);

          ints2.add(2);
          ints2.add(3);
          ints2.add(true);

          System.out.println(ints2);

// 명시적으로 type을 적어주는 것을 많이 사용한다.


        // ArrayList 와 for문 사용

        for (int i = 0; i < ints.size(); i++){
            if (ints.get(i) == 2) {
                System.out.println("2를 찾았다.");
            }
        }

        // remove
        ints.remove(0);
        System.out.println(ints);

    }

}
