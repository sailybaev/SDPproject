package duduPizza.models;

public abstract class ToppingDecorator extends Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();
}
