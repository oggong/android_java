package com.example.myapplication;

public class Calculator {

    int previousResult;

    public Calculator(int previousResult) {
        this.previousResult = previousResult;

    }

    public void add(int value) {
        previousResult += value;
        minusCheck();
    }// value 값이 들어오면 previousResult와 더해준다

    public void minus(int value) {
        previousResult = previousResult - value;
        minusCheck();
    } // value 값이 들어오면 previousResult에서 빼준다

    public void percent(int value) {
        previousResult = previousResult % value;
        minusCheck();
    }

    public void by(int value) {
        previousResult = previousResult / value;
        minusCheck();
    }

    public void multiple(int value) {
        previousResult = previousResult * value;
        minusCheck();
    }

    // 0보다 작은경우 0으로 만든다
    public void minusCheck() {
        if (previousResult < 0) {
            previousResult = 0;
        }
    }

    // 최종 결과 출력
    public void getResult() {
        System.out.println(previousResult);
    }
}
