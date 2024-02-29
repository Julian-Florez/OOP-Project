package shoppingPackage;
import java.util.ArrayList;
/**
 * This class represents a cart in the shop.
 * It contains the customer and the products in the cart.
 * It also contains methods to add, remove and clear the cart.
 * 
 */


public class Cart{
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Constructor for the Cart class.
     * @param customer
     */
    public Cart(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getters and setters for the Cart class.
     * @return
     */
    public Customer getCustomer() {
        return this.customer;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }
    
    /**
     * Method to add a product to the cart.
     * @param product
     */
    public void addProduct(Product product) {
        this.products.add(product);
    }

    /**
     * Method to remove a product from the cart.
     * @param product
     */
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    /**
     * Method to clear the cart.
     */
    public void clearCart() {
        this.products.clear();
    }

    public String toString() {
        return "(Products: " + this.products + " Customer: " + this.customer + ")";
    }
}