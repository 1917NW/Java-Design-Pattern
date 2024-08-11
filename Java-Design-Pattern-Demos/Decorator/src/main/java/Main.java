import pattern.Coffee;
import pattern.classes.SimpleCoffee;
import pattern.decorator.MilkCoffee;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " " + coffee.getCost());

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getCost());


    }
}
