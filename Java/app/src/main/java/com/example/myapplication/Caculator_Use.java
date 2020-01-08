package com.example.myapplication;

public class Caculator_Use {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(10);
        // 인스턴스화 할때 초기화 해주는 값

        calculator.add(10);
        calculator.getResult();

        calculator.minus(3);
        calculator.getResult();

        calculator.percent(5);
        calculator.getResult();

        calculator.multiple(3);
        calculator.getResult();

        calculator.by(3);
        calculator.getResult();


    }

}
