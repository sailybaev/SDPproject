package duduPizza.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import duduPizza.models.Order;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
        saveOrders();
    }

    public void cancelOrder(int orderId) {
        orders.removeIf(order -> order.getOrderId() == orderId);
        saveOrders();
    }

    private void saveOrders() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("src/main/resources/orders.json"), orders);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
