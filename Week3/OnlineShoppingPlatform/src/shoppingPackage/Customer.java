package shoppingPackage;
import java.util.ArrayList;

public class Customer{
    private String name;
    private String email;
    private String address;
    private int id;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Customer(String name, String email, String address, int id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "(Name: " + this.name + " Email: " + this.email + " Address: " + this.address + " ID: " + this.id + ")";
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}