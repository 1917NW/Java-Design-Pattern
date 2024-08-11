package factory;

import product.door.Door;
import product.door.impl.WoodenDoor;

public class DoorFactory {

    public static Door makeDoor(Double width, Double height) {
        return new WoodenDoor(width, height);
    }
}
