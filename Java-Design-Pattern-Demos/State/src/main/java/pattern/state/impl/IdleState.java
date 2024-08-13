package pattern.state.impl;

import pattern.CoffeeMachine;
import pattern.state.CoffeeMachineState;

public class IdleState implements CoffeeMachineState {
    private CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        coffeeMachine.setState(coffeeMachine.getSelectingState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("Please insert coin first");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please insert coin first");
    }
}
