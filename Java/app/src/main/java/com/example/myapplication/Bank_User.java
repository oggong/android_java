package com.example.myapplication;

public class Bank_User {

    public static void main(String[] args) {
        Bank bank = new Bank();
//        int customerMoney = bank.customerMoney;
//        System.out.println(customerMoney);
//
//        // 고객의 계좌의 잔고 금액을
//        // 마음대로 2000으로 올릴수 있다.
//        bank.customerMoney = 2000;
//        System.out.println(bank.customerMoney);

        // private 변경후 customerMoney에 접근 불가능

        int customerMoney = bank.checkCustomerMoney();
        System.out.println(customerMoney);
        // 바로 불러올 수 없게 하고
        // 임의로 변경을 불가능 하게 만드는 것
        // 조회만 가능하게 하는 법




    }
}
