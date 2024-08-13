package pattern.state.impl;

import pattern.CoffeeMachine;
import pattern.state.CoffeeMachineState;

public class DispensingState implements CoffeeMachineState {

    private CoffeeMachine coffeeMachine;

    public DispensingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee already selected");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Coffee dispensed");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
