package com.ismaildrs.testing;

public class PaymentService {

    Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(int amount) {
        payment.pay(amount);
    }

}
