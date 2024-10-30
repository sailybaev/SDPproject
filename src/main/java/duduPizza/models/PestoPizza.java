package duduPizza.models;

public class PestoPizza extends Pizza {
    public PestoPizza(){
        description = "Pesto Pizza";
    }
    @Override
        public double getCost(){
        return 10.00;
    }
}