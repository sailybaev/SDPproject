package duduPizza.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import duduPizza.OrderTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceTest {
    private List<OrderTest> orders = new ArrayList<>();

    public void placeOrder(OrderTest order) {
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
