package duduPizza;

import duduPizza.commands.*;
import duduPizza.models.*;
import duduPizza.services.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        OrderService orderService = new OrderService();

        Pizza margherita = pizzaFactory.createPizza("margherita");
        Pizza margheritaWithCheese = new CheeseTopping(margherita);

        System.out.println("Order: " + margheritaWithCheese.getDescription());
        System.out.println("Cost: $" + margheritaWithCheese.getCost());

        Order order = new Order(1, "Someone", Arrays.asList(margheritaWithCheese));
        Command placeOrder = new PlaceOrderCommand(orderService, order);
        placeOrder.execute();
    }
}
