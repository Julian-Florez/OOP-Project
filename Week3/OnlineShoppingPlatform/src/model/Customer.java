package model;
import java.util.ArrayList;

public class Customer{
    private String name;
    private String email;
    private String address;
    private int id;
    private ArrayList<Order> orders = new ArrayList<Order>();

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