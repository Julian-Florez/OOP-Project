package shoppingPackage;

public class Order{
    private int id;
    private Cart cart;
    private double total = 0.0;
    private MethodOfPayment methodOfPayment;
    private boolean processed = false;
    private boolean delivered = false;

    public Order(int id, Cart cart, MethodOfPayment methodOfPayment) {
        this.id = id;
        this.cart = cart;
        this.methodOfPayment = methodOfPayment;
        this.sumPrices();
    }

    public int getId() {
        return this.id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public double getTotal() {
        return this.total;
    }

    public MethodOfPayment getMethodOfPayment() {
        return this.methodOfPayment;
    }

    public boolean getProcessed() {
        return this.processed;
    }

    public boolean getDelivered() {
        return this.delivered;
    }


    public void sumPrices() {
        for (Product product : cart.getProducts()) {
            this.total += product.getPrice();
        }
    }

    public void processOrder() {
        this.processed = true;
    }

    public void deliverOrder() {
        this.delivered = true;
    }

    public String toString() {
        return "(Order: " + this.id + " Cart: " + this.cart + " Total: " + this.total + " Method of Payment: " + this.methodOfPayment + " Processed: " + this.processed + " Delivered: " + this.delivered + ")";
    }
}