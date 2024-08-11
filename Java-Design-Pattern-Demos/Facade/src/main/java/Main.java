import pattern.facade.SubSystemFacade;
import pattern.subsystems.SubSystemA;
import pattern.subsystems.SubSystemB;

public class Main {
    public static void main(String[] args) {
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();

        SubSystemFacade facade = new SubSystemFacade(subSystemA, subSystemB);
        facade.operation1();
        facade.operation2();
    }
}
