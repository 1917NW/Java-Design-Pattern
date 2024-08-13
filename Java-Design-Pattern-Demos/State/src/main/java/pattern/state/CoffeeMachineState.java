package pattern.state;

public interface CoffeeMachineState {
    void insertCoin();
    void selectCoffee();
    void dispenseCoffee();
}
