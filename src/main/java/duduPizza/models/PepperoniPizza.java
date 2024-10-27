package duduPizza.models;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Pepperoni Pizza";
    }

    @Override
    public double getCost() {
        return 7.00;
    }
}