package model;
import java.util.ArrayList;

public class Product{
    private String name;
    private int id;
    private double price;
    private int stock;
    private String category;

    public Product addProduct(String name, int id, double price, int stock, String category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.category = category;
        return this;
    }

    public void updateStock(int stock) {
        this.stock = stock;
    }

    public void updatePrice(double price) {
        this.price = price;
    }
}