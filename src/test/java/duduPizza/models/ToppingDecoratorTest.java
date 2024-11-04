package duduPizza.models;
import duduPizza.models.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class ToppingDecoratorTest {
    @Test
    public void testGetDescription() {
        Pizza pizza = new PepperoniPizza();
        Pizza cheese = new CheeseTopping(pizza);

        assertEquals("Pepperoni Pizza with Extra Cheese " , cheese.getDescription());
    }

    @Test
    public void testGetCost() {
        Pizza pizza = new PepperoniPizza();
        Pizza cheese = new CheeseTopping(pizza);

        assertEquals(8.50 , cheese.getCost(), 0.01);
    }


}
