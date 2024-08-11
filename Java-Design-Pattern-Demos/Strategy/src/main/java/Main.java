import pattern.pay.impl.BitcoinStrategy;
import pattern.pay.impl.CreditCardStrategy;
import pattern.pay.impl.PaypalStrategy;
import pattern.shop.Item;
import pattern.shop.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10.0);
        Item item2 = new Item("5678", 40.0);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com"));

        // pay by bitcoin
        cart.pay(new BitcoinStrategy("mybitcoinaddress"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("1234-5678-9012-3456"));

    }

}
