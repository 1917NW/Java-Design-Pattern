package pattern.pay.impl;

import pattern.pay.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    private String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("paid " +amount + " using Paypal");
    }
}
