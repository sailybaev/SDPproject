package duduPizza;

import duduPizza.models.Order;
import duduPizza.models.Pizza;
import duduPizza.services.MenuService;
import duduPizza.services.OrderService;

import java.util.List;

public class PizzaOrderingFacade {
    private final PizzaFactory pizzaFactory;
    private final MenuService menuService;
    private final OrderService orderService;

    public PizzaOrderingFacade() {
        this.pizzaFactory = new PizzaFactory();
        this.menuService = new MenuService();
        this.orderService = new OrderService();
    }

    public List<Pizza> loadMenu() {
        return menuService.loadMenu();
    }

    public Pizza createPizza(String type) {
        return pizzaFactory.createPizza(type);
    }

    public void placeOrder(Order order) {
        orderService.placeOrder(order);
    }

    public void cancelOrder(int orderId) {
        orderService.cancelOrder(orderId);
    }
}