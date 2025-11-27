package com.ismaildrs.testing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        PaymentService paymentService = new PaymentService();
        paymentService.setPayment(new CardPayment());
        paymentService.pay(10);

        paymentService.setPayment(new CashPayment());
        paymentService.pay(10);



    }
}
