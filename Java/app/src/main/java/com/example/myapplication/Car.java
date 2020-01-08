package com.example.myapplication;


public class Car {

    // 클래스 변수 선언
    int tires;
    String engine;
    Boolean superEngine;
    String break_;
    String handle;


    // 클래스 인스턴스화 할 생성자 함수 선언
    // 클래스를 실체화 한다. 만드는 방법이 적혀져 있다.
    // 자동차가 제 기능을 하기 위한 설명이 적혀있는것.

    // superEngine 제외한 모든 부품을 채워주는 생성자 생성
    public Car(int tires, String engine, String break_, String handle) {
        // this 키워드를 사용하여 변수 구분
        // this.tires = Car.tires // tires 는 생성자 내의 변수
        this.tires = tires;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    // 모든 부품을 채워주는 생성자 생성
    public Car(int tires, String engine, Boolean superEngine, String break_, String handle) {
        this.tires = tires;
        this.engine = engine;
        this.superEngine = superEngine;
        this.break_ = break_;
        this.handle = handle;
    }

//    종류 다른 두 생성자 생성

    // 직진 기능 생성
    public void goForward() {
        System.out.println("직진한다");
    }

    // 후진 기능 생성
    public void goBackward() {
        System.out.println("후진한다");
    }


    // 슈퍼카인가?
    public void isSuperCar() {
        if (superEngine == true) {
            System.out.println("슈퍼카 입니다");
        } else {
            System.out.println("슈퍼카가 아닙니다");
        }
    }


}// Class //폴더와 클래스이름 같아야 한다.

