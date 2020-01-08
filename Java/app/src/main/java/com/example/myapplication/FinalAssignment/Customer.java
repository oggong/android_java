package com.example.myapplication.FinalAssignment;

public class Customer {

    // 초깃값 설정

    Account account;

    public Customer(Account account) {

        this.account = account;
    }

    // 손님 클래스 기능
    public int checkAccount() {
        return account.money;
    }
    // 손님 계좌 잔액 반환


}
