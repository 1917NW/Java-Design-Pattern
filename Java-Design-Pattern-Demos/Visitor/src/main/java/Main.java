import pattern.interviewee.Animal;
import pattern.interviewee.impl.Dolphin;
import pattern.interviewee.impl.Lion;
import pattern.interviewee.impl.Monkey;
import pattern.visitor.AnimalVisitor;
import pattern.visitor.impl.Speak;

public class Main {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal lion = new Lion();
        Animal dolphin = new Dolphin();

        AnimalVisitor visitor = new Speak();
        monkey.accept(visitor);
        lion.accept(visitor);
        dolphin.accept(visitor);
    }
}
