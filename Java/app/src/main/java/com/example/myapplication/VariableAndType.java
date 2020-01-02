package com.example.myapplication;

public class VariableAndType {

    // 실습 내용
    public static void main(String[] args) {

        //primitive type variable

        short number1;
        int number2;
        long number3;

//        short $; 안됨
//        short 1; 안됨

        float number4;
        double number5;

        boolean truefalse;

        char writing;

        number1 = 10;
        number2 = 9;
        number3 = 8;

//        number4 = 1.1; 자바가 double로 인식하고 틀렷다고 표시함,
//        double값을 float에 넣으려 해서 오류발생
        number4 = 1.1f;
        number5 = 2.2;

        truefalse = true;
        truefalse = false;

        writing = '일';

// -----------------------------------------------------------------------

        int a;
        int b;

        a = 1 + 2 + 3 + 4 + 5;
        b = 6 + 7 + 8 + 9;

        int result;

        result = a + b;

        System.out.println(result);
    }

}
