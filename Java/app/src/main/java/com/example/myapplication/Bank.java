package com.example.myapplication;

public class Bank {

    //    public int customerMoney = 1000; // 고객 계좌 금액
    private int customerMoney = 1000; // 고객 계좌 금액

    // 그러나 예금이 얼마있는지는 확인할 수 있어야 업무가 가능하기 때문에 확인을 할 수 있어야한다.
    public int checkCustomerMoney() {

        return customerMoney;
    }

    // 송금기능
    // 함수를 통해서 들어온 금액 만큼 송금
    public void transferMoney(int customerMoney) {
        if (certificate() == true) {
            if (otp() == true) {
                System.out.println("송금");
            }
        }
    }

    // 송금하기 위한 절차
    private boolean certificate() {
        return true;
        // 임의로 지정
    }

    //otp
    private boolean otp() {
        return true;
    }
    // private를 해줘야 접근할 수 없음.
}
