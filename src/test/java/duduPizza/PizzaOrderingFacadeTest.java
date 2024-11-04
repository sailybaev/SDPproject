package duduPizza;

import duduPizza.models.Order;
import duduPizza.models.PepperoniPizza;
import duduPizza.models.PestoPizza;
import duduPizza.models.Pizza;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class PizzaOrderingFacadeTest {
    @Test
    public void testCreatePizza() {
        PizzaOrderingFacade facade = new PizzaOrderingFacade();
        List<Pizza> pizzas = new ArrayList<>();
        Pizza pizza = facade.createPizza("pesto");
        pizzas.add(pizza);
        Order order = new Order(1, "Daniyal" , pizzas);
        facade.placeOrder(order);
        assertNotNull(order);
    }

    @Test
    public void testCancelOrder() {
        PizzaOrderingFacade facade = new PizzaOrderingFacade();
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new PestoPizza());
        String name = "Daniyal";
        Order order = new Order(name.hashCode() , name , pizzas);
        facade.placeOrder(order);
        facade.cancelOrder(name.hashCode());

        List<Order> orders = facade.getOrders();

        assertTrue(orders.isEmpty());


    }



}
