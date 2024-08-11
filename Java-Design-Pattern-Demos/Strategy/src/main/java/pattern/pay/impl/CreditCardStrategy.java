package pattern.pay.impl;

import pattern.pay.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid "+ amount + " using credit/debit card");
    }
}
