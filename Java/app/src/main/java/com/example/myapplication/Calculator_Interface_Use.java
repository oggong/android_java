package com.example.myapplication;

public class Calculator_Interface_Use {

    // Calculator_Real 을 사용할 개발자는 Calculator_Real 이 만들어지기 이전에
    // Calculator_Fake 생성
    public static void main(String [] args) {

        Calculator_Fake calculatorFake = new Calculator_Fake();

        calculatorFake.sum();
        calculatorFake.by();
        calculatorFake.minus();
        calculatorFake.multiple();
        // 가짜 기능을 사용해서 작업

        // Calculator_Real 이 다 완성되면 Fake 만 Real로 바꿔줌

    }

}
