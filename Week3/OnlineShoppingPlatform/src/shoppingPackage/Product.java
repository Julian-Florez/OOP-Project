package shoppingPackage;

public class Product{
    private String name;
    private int id;
    private double price;
    private int stock;
    private String category;

    public Product(String name, int id, double price, int stock, String category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

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

    public String toString() {
        return "(Name: " + this.name + " ID: " + this.id + " Price: " + this.price + " Stock: " + this.stock + " Category: " + this.category + ")";
    }
}