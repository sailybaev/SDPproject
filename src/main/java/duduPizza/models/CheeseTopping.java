package duduPizza.models;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Extra Cheese ";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
    @Override
    public String toString() {
        return getDescription() +
                getCost()+"";
    }
}