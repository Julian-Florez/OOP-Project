package model;
import java.util.ArrayList;

public class Product{
    String name;
    int id;
    double price;
    int stock;
    String category;

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