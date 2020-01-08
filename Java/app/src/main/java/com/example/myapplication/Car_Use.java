package com.example.myapplication;

public class Car_Use {

    public static void main(String[] args) {

        // 모든 클래스는 타입이 될수 있다.
        // Car Type을 만들어야 한다.
        // Type Car 변수명 normalCar

        Car normalCar = new Car(4, "일반 엔진", "브레이크", "핸들");
        // 실체화 인스턴스화 되었다.

        Car superCar = new Car(4, "슈퍼 엔진", true, "브레이크", "핸들");


//        Car들의 기능 사용

        normalCar.goForward();
        superCar.goBackward();

        superCar.isSuperCar();


        
    }

}
