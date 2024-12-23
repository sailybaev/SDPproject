package duduPizza.models;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Pizza> pizzas;
    private double totalPrice;

    public Order(int orderId, String customerName, List<Pizza> pizzas) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.pizzas = pizzas;
    }

    public Order(){}

    public double calculateTotalPrice() {
        return pizzas.stream().mapToDouble(Pizza::getCost).sum();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public double getTotalPrice() {
        int cal = 0;
        for(int i = 0;i<pizzas.toArray().length;i++) {
            cal+=pizzas.get(i).getCost();
        }
        return cal;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", pizzas=" + pizzas +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
