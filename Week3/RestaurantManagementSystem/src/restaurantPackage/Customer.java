package restaurantPackage;

public class Customer {
    private String name;
    private String phone_number;
    private int id;
    private Table table;

    /**
     * Constructor for the Customer class.
     * @param name
     * @param phone_number
     * @param id
     */
    public Customer(String name, String phone_number, int id, Table table) {
        this.name = name;
        this.phone_number = phone_number;
        this.id = id;
        this.table = table;
        table.addCustomer(this);
    }

    /**
     * Getters and Setters for the Customer class.
     * @return
     */

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * toString method for the Customer class.
     */

    public String toString() {
        return "(Name: " + name + ", Phone Number: " + phone_number + ", ID: " + id + ")";

    }
}
