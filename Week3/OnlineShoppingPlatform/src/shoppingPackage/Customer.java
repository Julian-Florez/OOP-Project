package shoppingPackage;
import java.util.ArrayList;

public class Customer{
    String name;
    String email;
    String address;
    int id;
    ArrayList<Order> orders = new ArrayList<Order>();

    public Customer addCustomer(String name, String email, String address, int id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = id;
        return this;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}