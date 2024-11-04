package duduPizza.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class HawaiianPizzaTest {
    @Test
    public void testGetDescription() {
        HawaiianPizza pizza = new HawaiianPizza();
        assertEquals("Hawaiian Pizza" , pizza.getDescription());
    }

    @Test
    public void testGetCost(){
        Pizza pizza = new HawaiianPizza();
        assertEquals(775.0, pizza.getCost(), 0.01);
    }
}