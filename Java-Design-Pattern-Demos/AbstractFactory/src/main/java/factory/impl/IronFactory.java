package factory.impl;

import factory.AbstractFactoryInterface;
import product.productA.ProductA;
import product.productA.impl.IronProductA;
import product.productA.impl.WoodenProductA;
import product.productB.ProductB;
import product.productB.impl.IronProductB;
import product.productB.impl.WoodenProductB;

public class IronFactory implements AbstractFactoryInterface {
    @Override
    public ProductA createProductA() {
        return new IronProductA();
    }

    @Override
    public ProductB createProductB() {
        return new IronProductB();
    }
}
