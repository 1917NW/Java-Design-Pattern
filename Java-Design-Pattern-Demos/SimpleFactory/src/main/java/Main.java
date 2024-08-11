import factory.DoorFactory;
import product.door.Door;

public class Main {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100.0, 200.0);
        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());
    }
}
