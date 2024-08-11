import pattern.Caretaker;
import pattern.Memento;
import pattern.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        textEditor.type("123");
        Memento save1 = textEditor.save();
        caretaker.addMemento(save1);

        textEditor.type("456");
        Memento save2 = textEditor.save();
        caretaker.addMemento(save2);

        textEditor.restore(caretaker.getMemento(0));
        System.out.println(textEditor.getContent());

        textEditor.restore(caretaker.getMemento(1   ));
        System.out.println(textEditor.getContent());

    }
}
