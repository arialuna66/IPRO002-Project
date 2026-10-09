
import java.util.ArrayList;

public class Order {

    private String orderID;
    private Customer customer;
    private double totalPrice;
    private OrderStatus status;
    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Order(String orderID, Customer customer, double totalPrice) {
        this.orderID = orderID;
        this.customer = customer;
        this.totalPrice = 0;
        this.status = OrderStatus.DESIGNED;
    }

    public String getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public double getTotal() {
        return totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < menuItems.size(); i++) {
            totalPrice += menuItems.get(i).getPrice();
        }

        totalPrice = totalPrice * customer.calculateDiscountedPrice();
    }

    public String toString() {
        return "Order " + orderID + " for " + customer.getName() + " - total: $" + totalPrice;
    }

}
