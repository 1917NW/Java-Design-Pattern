import factory.AbstractFactoryInterface;
import factory.impl.IronFactory;
import factory.impl.WoodenFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryInterface woodenFactory = new WoodenFactory();
        woodenFactory.createProductA().infoA();
        woodenFactory.createProductB().infoB();

        AbstractFactoryInterface ironFactory = new IronFactory();
        ironFactory.createProductA().infoA();
        ironFactory.createProductB().infoB();
    }
}
