import pattern.Bulb;
import pattern.RemoteControl;
import pattern.command.Command;
import pattern.command.impl.TurnOff;
import pattern.command.impl.TurnOn;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        Command turnOn = new TurnOn(bulb);
        Command turnOff = new TurnOff(bulb);

        RemoteControl remote = new RemoteControl();
        remote.submit(turnOn);
        remote.submit(turnOff);

    }
}
