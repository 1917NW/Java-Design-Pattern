package factory.impl;

import factory.AbstractFactoryInterface;
import product.productA.ProductA;
import product.productA.impl.WoodenProductA;
import product.productB.ProductB;
import product.productB.impl.WoodenProductB;

public class WoodenFactory implements AbstractFactoryInterface {
    @Override
    public ProductA createProductA() {
        return new WoodenProductA();
    }

    @Override
    public ProductB createProductB() {
        return new WoodenProductB();
    }
}
