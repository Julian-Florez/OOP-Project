package restaurantPackage;
import java.util.ArrayList;

public class Table {
    private int table_number;
    private int capacity;
    private boolean availability;
    private ArrayList<Customer> customers;
    private Order order;

    /**
     * Constructor for the Table class.
     * @param table_number
     * @param capacity
     * @param availability
     */
    public Table(int table_number, int capacity) {
        this.table_number = table_number;
        this.capacity = capacity;
        this.availability = true;
        this.customers = new ArrayList<Customer>();
        this.order = null;
    }

    /**
     * Getters and Setters for the Table class.
     * @return
     */

    public int getTable_number() {
        return table_number;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getAvailability() {
        return availability;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Order getOrder() {
        return order;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        this.availability = false;
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        checkIfEmpty();
    }

    public void checkIfEmpty() {
        if (customers.size() == 0) {
            availability = true;
        }
    }

    /**
     * toString method for the Table class.
     */

    public String toString() {
        return "(Table Number: " + table_number + ", Capacity: " + capacity + ", Availability: " + availability + ", Customers: " + customers + ", Order: " + order + ")";

    }
}
