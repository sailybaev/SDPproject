package duduPizza.models;

public class HawaiianPizza extends Pizza {
    public HawaiianPizza() {
        description = "Hawaiian Pizza";
    }

    @Override
    public double getCost() {
        return 775.00;
    }
}