package duduPizza.models;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Mushrooms ";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00;
    }
    @Override
    public String toString() {
        return getDescription() +
                getCost()+"";
    }
}
