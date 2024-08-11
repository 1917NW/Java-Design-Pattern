package factory.impl;

import factory.FactoryMethodInterface;
import product.Door;
import product.impl.WoodenDoor;

public class WoodenDoorFactory implements FactoryMethodInterface {
    @Override
    public Door makeProduct(Double width, Double height) {
        return new WoodenDoor(width, height);
    }
}
