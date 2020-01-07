package com.example.myapplication;

import java.util.ArrayList;

public class Java_middle_example1 {

    public static void main(String[] args) {

        ArrayList<Integer> ArrayList1 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            ArrayList1.add(i);
        }

        System.out.println(ArrayList1);

        ArrayList ArrayList2 = new ArrayList();

        for (int i = 0; i < ArrayList1.size(); i++) {

            if (ArrayList1.get(i) < 5) {
                ArrayList2.add(true);
            } else {
                ArrayList2.add(false);
            }
        }
        System.out.println(ArrayList2);

    }
}
