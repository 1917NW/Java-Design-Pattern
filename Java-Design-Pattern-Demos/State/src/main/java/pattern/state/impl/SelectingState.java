package pattern.state.impl;

import pattern.CoffeeMachine;
import pattern.state.CoffeeMachineState;

public class SelectingState implements CoffeeMachineState {

    private CoffeeMachine coffeeMachine;

    public SelectingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee selected");
        coffeeMachine.setState(coffeeMachine.getDispensingState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please select coffee first");
    }
}
