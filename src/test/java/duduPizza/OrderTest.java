package duduPizza;

import duduPizza.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void testAddPizza(){
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new PestoPizza());
        pizzas.add(new CheeseTopping(new PestoPizza()));

        Order order = new Order(1 , "Daniyal" , pizzas);

        assertEquals(2 , order.getPizzas().size());
        assertEquals(pizzas , order.getPizzas());
    }

    @Test
    public void testTotalPrice() {
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new PestoPizza());
        pizzas.add(new CheeseTopping(new PestoPizza()));

        Order order = new Order(1 , "Daniyal" , pizzas);

        assertEquals(21.00 , order.getTotalPrice() , 0.01);
    }

}