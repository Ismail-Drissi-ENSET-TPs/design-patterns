package com.ismaildrs.testing;

public class CardPayment implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("Payment with card.");
    }
}
