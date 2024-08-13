package pattern;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    abstract public void brew();

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    abstract public void addCondiments();
}
