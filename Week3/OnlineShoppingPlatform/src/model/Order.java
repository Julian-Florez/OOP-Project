package model;
import java.util.ArrayList;

public class Order{
    private int id;
    private Cart cart;
    private double total = 0.0;
    private MethodOfPayment methodOfPayment;
    private boolean processed = false;
    private boolean delivered = false;

    public Order addOrder(int id, Cart cart, MethodOfPayment methodOfPayment) {
        this.id = id;
        this.cart = cart;
        this.methodOfPayment = methodOfPayment;
        this.sumPrices();
        return this;
    }
    
    public void sumPrices() {
        for (Product product : cart.products) {
            this.total += product.price;
        }
    }

    public void processOrder() {
        this.processed = true;
    }

    public void deliverOrder() {
        this.delivered = true;
    }
}