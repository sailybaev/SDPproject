package duduPizza;

import duduPizza.models.*;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "margherita":
                return new MargheritaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "pesto":
                return new PestoPizza();
            case "hawaiian":
                return new HawaiianPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
