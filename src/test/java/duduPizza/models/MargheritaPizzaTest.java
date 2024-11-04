package duduPizza.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class MargheritaPizzaTest {
    @Test
    public void testGetDescription() {
        Pizza pizza = new MargheritaPizza();
        assertEquals("Margherita Pizza" , pizza.getDescription());
    }

    @Test
    public void testGetCost(){
        Pizza pizza = new MargheritaPizza();
        assertEquals(5.00, pizza.getCost(), 0.01);
    }
}