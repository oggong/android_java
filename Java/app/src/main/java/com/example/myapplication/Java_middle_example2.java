package com.example.myapplication;

import java.util.ArrayList;

public class Java_middle_example2 {

    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ArrayList.add(i);
        }
        System.out.println(ArrayList);
        System.out.println(howManyOdds(ArrayList));
    }

    public static int howManyOdds(ArrayList<Integer> list) {
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                result++;
            }
        }
        return result;
    }

}
