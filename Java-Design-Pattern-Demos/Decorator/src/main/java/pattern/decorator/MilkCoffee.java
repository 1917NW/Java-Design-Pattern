package pattern.decorator;

import pattern.Coffee;

public class MilkCoffee implements Coffee{
    protected Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}
