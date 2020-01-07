package com.example.myapplication;

import java.util.ArrayList;

public class Mid_test {

    public static void main(String[] args) {

        // 문제 1번
        ArrayList<Integer> q1_list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            q1_list1.add(i);
        }
        System.out.println(q1_list1);

        ArrayList<Boolean> q1_list2 = new ArrayList<>();

        for (int i = 0; i < q1_list1.size(); i++) {

            if (q1_list1.get(i) < 5) {
                q1_list2.add(true);
            } else {
                q1_list2.add(false);
            }
        }
        System.out.println(q1_list2);

        // 문제 2
        ArrayList<Integer> q2_list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            q2_list1.add(i);
        }
        System.out.println(q2_list1);

        System.out.println(howManyOdds(q2_list1));

        // 문제 3
        ArrayList<Integer> q3_list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q3_list1.add(i);
        }
        System.out.println(q3_list1);

        ArrayList<Integer> q3_list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q3_list2.add(9 - i);
        }
        System.out.println(q3_list2);

        multipleTwoArrayList(q3_list1, q3_list2);

    }

    // 문제 2
    public static int howManyOdds(ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                result++;
            }
        }
        return result;
    }

    // 문제 3
    public static void multipleTwoArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (int i = 0; i < list1.size(); i++) {
            int result = list1.get(i) * list2.get(i);
            System.out.println(result);
        }
    }


}
