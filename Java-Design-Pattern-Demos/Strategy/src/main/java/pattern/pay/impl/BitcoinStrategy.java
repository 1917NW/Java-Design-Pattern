package pattern.pay.impl;

import pattern.pay.PaymentStrategy;

public class BitcoinStrategy implements PaymentStrategy {

    private String walletAddress;

    public BitcoinStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " using Bitcoin");
    }
}
