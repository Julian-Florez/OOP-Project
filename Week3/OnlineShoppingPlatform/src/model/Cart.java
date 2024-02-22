package model;
import java.util.ArrayList;

public class Cart{
    Customer customer;
    ArrayList<Product> products = new ArrayList<Product>();

    public Cart addCart(Customer customer) {
        this.customer = customer;
        return this;
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
}