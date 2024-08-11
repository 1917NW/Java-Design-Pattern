package pattern.facade;

import pattern.subsystems.SubSystemA;
import pattern.subsystems.SubSystemB;

public class SubSystemFacade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public SubSystemFacade(SubSystemA subSystemA, SubSystemB subSystemB) {
        this.subSystemA = subSystemA;
        this.subSystemB = subSystemB;
    }

    public void operation1() {
        System.out.println("Facade: operation1");
        subSystemA.operationA1();
        subSystemB.operationB1();
    }

    public void operation2() {
        System.out.println("Facade: operation2");
        subSystemA.operationA2();
        subSystemB.operationB2();
    }
}
