package shoppingPackage;
/**
 * This class represents a product in the shop.
 * It contains the name, id, price, stock and category of the product.
 */

public class Product{
    private String name;
    private int id;
    private double price;
    private int stock;
    private String category;

    /**
     * Constructor for the Product class.
     * @param name
     * @param id
     * @param price
     * @param stock
     * @param category
     */
    public Product(String name, int id, double price, int stock, String category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    /**
     * Getters and setters for the Product class.
     * @return
     */
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method to print the product.
     */
    public String toString() {
        return "(Name: " + this.name + " ID: " + this.id + " Price: " + this.price + " Stock: " + this.stock + " Category: " + this.category + ")";
    }
}