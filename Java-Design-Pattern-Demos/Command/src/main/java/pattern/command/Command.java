package pattern.command;

public interface Command {
    void execute();
    void undo();
    void redo();
}
