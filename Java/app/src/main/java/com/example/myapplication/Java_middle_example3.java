package com.example.myapplication;

import java.util.ArrayList;

public class Java_middle_example3 {

    public static void main(String[] args) {

        ArrayList<Integer> ArrayList1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ArrayList1.add(i);
        }
        System.out.println(ArrayList1);

        ArrayList<Integer> ArrayList2 = new ArrayList<>();

        for (int i = 9; i > -1; i--) {
            ArrayList2.add(i);
        }
        System.out.println(ArrayList2);

        multipleTwoArrayLists(ArrayList1, ArrayList2);

    }

    public static void multipleTwoArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (int i = 0; i < list1.size(); i++) {
                int result = list1.get(i) * list2.get(i);
                System.out.println(result);
        }
    }

}
