package restaurantPackage;
import java.util.ArrayList;

public class Order {
    private int order_id;
    private Table table;
    private ArrayList<Item> items;
    private double total_price;
    private boolean status;

    /**
     * Constructor for the Order class.
     * @param order_id
     * @param table
     * @param items
     * @param total_price
     * @param status
     */
    public Order(int order_id, Table table) {
        this.order_id = order_id;
        this.table = table;
        this.items = new ArrayList<Item>();
        this.total_price = 0;
        this.status = false;
        table.setOrder(this);
    }

    /**
     * Getters and Setters for the Order class.
     * @return
     */
    public int getOrder_id() {
        return order_id;
    }

    public Table getTable() {
        return table;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotal_price() {
        return total_price;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void addItem(Item item) {
        items.add(item);
        calculateTotalPrice();
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Method to calculate the total price of the order.
     */

    public void calculateTotalPrice() {
        total_price = 0;
        for (Item item : items) {
            total_price += item.getPrice();
        }
    }

    /**
     * toString method for the Order class.
     */
    public String toString() {
        return "(Order ID: " + order_id + ", Items: " + items + ", Total Price: " + total_price + ", Status: " + status+")";

    }
}
