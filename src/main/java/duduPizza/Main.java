package duduPizza;

import duduPizza.models.CheeseTopping;
import duduPizza.models.MushroomTopping;
import duduPizza.models.Order;
import duduPizza.models.Pizza;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaOrderingFacade facade = new PizzaOrderingFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.  Poka ne robit :)");
            System.out.println("2. Create Pizza");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Pizza> menu = facade.loadMenu();
                    if (menu != null) {
                        System.out.println("Menu:");
                        for (Pizza pizza : menu) {
                            System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
                        }
                    } else {
                        System.out.println("Failed to load menu.");
                    }
                    break;
                case 2:
                    System.out.println("Choose and enter pizza type: ");
                    System.out.println("1. Hawaiian pizza");
                    System.out.println("2. Margherita pizza");
                    System.out.println("3. Pepperoni pizza");
                    System.out.println("4. Pesto pizza");
                    String type = scanner.nextLine();
                    Pizza pizza = facade.createPizza(type);
                    System.out.println("Created: " + pizza.getDescription() + " - $" + pizza.getCost());
                    break;
                case 3:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.println("Choose and enter pizza type: ");
                    System.out.println("1. Hawaiian pizza");
                    System.out.println("2. Margherita pizza");
                    System.out.println("3. Pepperoni pizza");
                    System.out.println("4. Pesto pizza");
                    String pizzaType = scanner.nextLine();
                    Pizza orderPizza = facade.createPizza(pizzaType);
                    System.out.println("Enter topping type(cheese, mushroom or none): ");
                    String toppingType = scanner.nextLine();
                    if(Objects.equals(toppingType, "cheese")){
                        Pizza pizzaWithCheese = new CheeseTopping(orderPizza);
                        Order order = new Order(1, customerName, Arrays.asList(pizzaWithCheese));
                        facade.placeOrder(order);
                        System.out.println("Order placed: " + pizzaWithCheese.getDescription() + " - $" + pizzaWithCheese.getCost());
                        break;
                    } else if (Objects.equals(toppingType, "mushroom")) {
                        Pizza pizzaWithMushroom = new MushroomTopping(orderPizza);
                        Order order = new Order(1, customerName, Arrays.asList(pizzaWithMushroom));
                        facade.placeOrder(order);
                        System.out.println("Order placed: " + pizzaWithMushroom.getDescription() + " - $" + pizzaWithMushroom.getCost());
                        break;
                    }
                    else {
                        Order order = new Order(1, customerName, Arrays.asList(orderPizza));
                        facade.placeOrder(order);
                        System.out.println("Order placed: " + orderPizza.getDescription() + " - $" + orderPizza.getCost());
                        break;
                    }
                case 4:
                    System.out.print("Enter order ID to cancel: ");
                    int orderId = scanner.nextInt();
                    facade.cancelOrder(orderId);
                    System.out.println("Order cancelled.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}