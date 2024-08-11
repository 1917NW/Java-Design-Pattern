package pattern;

import pattern.command.Command;

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}
