package com.example.myapplication;

public class Method {

    // 함수 메소드 생성
    public int plus(int a, int b) {
        int result;
        result = a + b;
        return result;
        // return 1.1f; //Type이 맞지 않기 때문에 에러
    }

    public void plus1(int a, int b) {
        int result;
        result = a + b;
    }
    // 같은 이름의 함수가 존재 할 수 없음
    // 함수이름은 유일해야 한다

    public static void main(String[] args) {
        new Method().plus(10,20);
        new Method().plus1(30,40);

        int number1;
        int number2;

        number1 = new Method().plus(100,100);
        number2 = new Method().plus(50,50);

        System.out.println(number1);
        System.out.println(number2);
    }

}
