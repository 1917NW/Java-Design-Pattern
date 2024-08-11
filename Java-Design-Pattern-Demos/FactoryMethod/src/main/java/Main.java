import factory.FactoryMethodInterface;
import factory.impl.IronDoorFactory;
import factory.impl.WoodenDoorFactory;
import product.Door;

public class Main {
    public static void main(String[] args) {
        FactoryMethodInterface woodenDoorFactory = new WoodenDoorFactory();
        Door woodenDoor = woodenDoorFactory.makeProduct(100.0, 200.0);
        System.out.println("Width: " + woodenDoor.getWidth() + " Height: " + woodenDoor.getHeight());

        FactoryMethodInterface ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeProduct(300.0, 400.0);
        System.out.println("Width: " + ironDoor.getWidth() + " Height: " + ironDoor.getHeight());
    }
}
