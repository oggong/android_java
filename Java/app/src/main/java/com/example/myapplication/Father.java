package com.example.myapplication;

public class Father extends Human {

    // Father 생성자 함수 생성
    public Father() {

    }

//    public void eat(){
//        System.out.println("먹는다");
//    }
//    public void sleep(){
//        System.out.println("잔다");
//    }
//    public void wash(){
//        System.out.println("씻는다");
//    }

    // Father class가 가지고 있는 고유한 기능
    public void work() {
        System.out.println("일한다");
    }

    // 오버라이딩 해서 먹는 기능 수정
    @Override
    public void eat() {

        //super.eat();
        // father class 의 부모 클래스 human
        // human.eat() 과 동일

        // 수정하고 싶으면 여기에 입력
        System.out.println("많이 먹는다");

    }

    // 오버로드
    public void wash(String shampoo) {
        System.out.println("샴푸로 샤워한다,");
    }

}
