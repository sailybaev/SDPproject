package duduPizza.commands;

import duduPizza.models.Order;
import duduPizza.services.OrderService;

public class PlaceOrderCommand implements Command {
    private OrderService orderService;
    private Order order;

    public PlaceOrderCommand(OrderService orderService, Order order) {
        this.orderService = orderService;
        this.order = order;
    }

    @Override
    public void execute() {
        orderService.placeOrder(order);
    }
}
