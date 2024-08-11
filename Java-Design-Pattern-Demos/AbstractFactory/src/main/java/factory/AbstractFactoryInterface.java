package factory;

import product.productA.ProductA;
import product.productB.ProductB;

public interface AbstractFactoryInterface {
    public ProductA createProductA();
    public ProductB createProductB();
}
