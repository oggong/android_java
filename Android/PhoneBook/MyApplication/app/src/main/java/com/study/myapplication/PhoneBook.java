package com.study.myapplication;

public class PhoneBook {

    // PhoneBook 객체 생성
    // 이미지, 이름, 전화번호
    public String image;
    public String name;
    public String number;

    // 세가지 모두 받는 생성자 생성
    public PhoneBook(String image, String name, String number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }
}
