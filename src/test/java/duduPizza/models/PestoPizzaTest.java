package duduPizza.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class PestoPizzaTest {
    @Test
    public void testGetDescription() {
        Pizza pizza = new PestoPizza();
        assertEquals("Pesto Pizza" , pizza.getDescription());
    }

    @Test
    public void testGetCost(){
        Pizza pizza = new PestoPizza();
        assertEquals(10.0, pizza.getCost());
    }
}