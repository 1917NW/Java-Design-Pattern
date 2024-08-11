package pattern;

public abstract class Account {
    protected Account successor;
    protected double balance;

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(double amountToPay) {
        if (canPay(amountToPay)) {
            System.out.println("Paid " + amountToPay + " using " + this.getClass().getSimpleName());
        } else if (successor != null) {
            System.out.println("Cannot pay using " + this.getClass().getSimpleName() + ". Proceeding...");
            successor.pay(amountToPay);
        } else {
            System.out.println("None of the accounts have enough balance");
        }
    }

    public boolean canPay(double amountToPay) {
        return this.balance >= amountToPay;
    }
}
