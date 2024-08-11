package factory.impl;

import factory.FactoryMethodInterface;
import product.Door;
import product.impl.IronDoor;

public class IronDoorFactory implements FactoryMethodInterface {
    @Override
    public Door makeProduct(Double width, Double height) {
        return new IronDoor(width, height);
    }
}
