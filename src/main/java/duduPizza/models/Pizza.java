package duduPizza.models;

public abstract class Pizza {
    protected String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}