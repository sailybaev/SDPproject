package duduPizza.UI;

import duduPizza.PizzaOrderingFacade;
import duduPizza.models.CheeseTopping;
import duduPizza.models.MushroomTopping;
import duduPizza.models.Order;
import duduPizza.models.Pizza;

import java.util.*;

public class UI {

    public static PizzaOrderingFacade facade = new PizzaOrderingFacade();
    public static Scanner scanner = new Scanner(System.in);
    public static List<Pizza> pizzas = new ArrayList<>();

    public static void uiStart() {

        while (true) {
            System.out.println("°⨳°·..·°⨳°⊹ DuDu  ٭⊹°⨳°·..·°⨳°");
            System.out.println("1. Display Cart");
            System.out.println("2. Add Pizza");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");

            if (choice == 1) {
                displayCart();
            } else if (choice == 2) {
                addPizzaToCart();
            } else if (choice == 3) {
                placeOrderCart();
            } else if (choice == 4) {
                cancelOrderByName();
            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void cancelOrderByName() {
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        facade.cancelOrder(customerName.hashCode());
        System.out.println("Order canceled");
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
    }

    public static void placeOrderCart() {
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");

        Order order = new Order(customerName.hashCode(), customerName, pizzas);
        facade.placeOrder(order);
        displayCart(order);

        System.out.println("Confirm the order (y/n)");
        String ans = scanner.nextLine();
        if (ans.equals("y")) {
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            System.out.println("Your order has been confirmed");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
        } else {
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            System.out.println("Try again");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
        }
    }

    public static void addPizzaToCart() {
        System.out.println("Choose and enter pizza type: ");
        System.out.println("1. Hawaiian pizza");
        System.out.println("2. Margherita pizza");
        System.out.println("3. Pepperoni pizza");
        System.out.println("4. Pesto pizza");
        String pizzaType = scanner.nextLine();
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
        if (pizzaType.equals("1")) {
            pizzaType = "Hawaiian";
        } else if (pizzaType.equals("2")) {
            pizzaType = "Margherita";
        } else if (pizzaType.equals("3")) {
            pizzaType = "Pepperoni";
        } else if (pizzaType.equals("4")) {
            pizzaType = "Pesto";
        } else {
            System.out.println("New pizza is coming soon...");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            return;
        }
        Pizza orderPizza = facade.createPizza(pizzaType);
        System.out.println("Enter topping type(cheese, mushroom or none): ");
        String toppingType = scanner.nextLine();
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
        if (Objects.equals(toppingType, "cheese")) {
            Pizza pizzaWithCheese = new CheeseTopping(orderPizza);
            orderPizza = pizzaWithCheese;
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            System.out.println("Topping has been added");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            pizzas.add(orderPizza);
        } else if (Objects.equals(toppingType, "mushroom")) {
            Pizza pizzaWithMushroom = new MushroomTopping(orderPizza);
            orderPizza = pizzaWithMushroom;
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            System.out.println("Topping has been added");
            System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
            pizzas.add(orderPizza);
        } else {
            pizzas.add(orderPizza);
        }
    }

    public static void displayCart() {
        System.out.println("===Your order===");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println(pizzas.get(i));
        }
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
    }

    public static void displayCart(Order order) {
        System.out.println("===Your order===");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println(pizzas.get(i));
        }
        System.out.println("Total: " + order.getTotalPrice());
        System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
    }
}