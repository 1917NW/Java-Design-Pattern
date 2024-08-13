package pattern;

import pattern.state.CoffeeMachineState;
import pattern.state.impl.DispensingState;
import pattern.state.impl.IdleState;
import pattern.state.impl.SelectingState;

public class CoffeeMachine {
    private CoffeeMachineState idleState;
    private CoffeeMachineState selectingState;
    private CoffeeMachineState dispensingState;

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        idleState = new IdleState(this);
        selectingState = new SelectingState(this);
        dispensingState = new DispensingState(this);
        currentState = idleState;
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectCoffee() {
        currentState.selectCoffee();
    }

    public void dispenseCoffee() {
        currentState.dispenseCoffee();
    }

    public CoffeeMachineState getIdleState() {
        return idleState;
    }

    public CoffeeMachineState getSelectingState() {
        return selectingState;
    }

    public CoffeeMachineState getDispensingState() {
        return dispensingState;
    }



}
