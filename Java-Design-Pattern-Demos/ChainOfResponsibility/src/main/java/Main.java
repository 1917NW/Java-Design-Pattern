import pattern.Account;
import pattern.impl.Bank;
import pattern.impl.Bitcoin;
import pattern.impl.Paypal;

public class Main {
    public static void main(String[] args) {
        Account bank = new Bank(100);
        Account paypal = new Paypal(200);
        Account bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        bank.pay(259);
    }
}
