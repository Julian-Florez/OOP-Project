package model;

public class Order{
    int id;
    Cart cart;
    double total = 0.0;
    MethodOfPayment methodOfPayment;
    boolean processed = false;
    boolean delivered = false;

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