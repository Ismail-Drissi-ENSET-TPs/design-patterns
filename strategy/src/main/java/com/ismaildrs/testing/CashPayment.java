package com.ismaildrs.testing;

public class CashPayment implements Payment{


    @Override
    public void pay(int amount) {
        System.out.println("Payment with cash.");
    }
}
