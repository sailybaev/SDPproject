package duduPizza.models;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        description = "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}