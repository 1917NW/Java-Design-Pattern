package pattern.command.impl;

import pattern.Bulb;
import pattern.command.Command;

public class TurnOff implements Command {
    private Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }
    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
}
