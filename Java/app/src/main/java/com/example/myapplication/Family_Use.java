package com.example.myapplication;

public class Family_Use {

    public static void main(String[] args) {

        Father father = new Father();
        Mother mother = new Mother();
        Son son = new Son();

//        father.work();
//        mother.cook();
//        son.study();

        // Human 상속 후 출력
//        father.eat();
//        mother.sleep();
//        son.wash();

        // 오버라이드 해서 수정하여 출력
        father.eat();
        mother.eat();
        son.eat();

        // 오버로딩
        father.wash("샴푸");

    }

}
