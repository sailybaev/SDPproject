package duduPizza.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class PepperoniPizzaTest {
    @Test
    public void testGetDescription() {
        Pizza pizza = new PepperoniPizza();
        assertEquals("Pepperoni Pizza" , pizza.getDescription());
    }

    @Test
    public void testGetCost(){
        Pizza pizza = new PepperoniPizza();
        assertEquals(7.00, pizza.getCost());
    }
}