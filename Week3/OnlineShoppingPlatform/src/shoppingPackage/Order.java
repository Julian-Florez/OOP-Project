package shoppingPackage;
/**
 * This class represents an order in the shop.
 * It contains the id, cart, total, method of payment, processed and delivered of the order.
 * It also contains the methods to process and deliver the order.
 * It also contains the method to sum the prices of the products in the cart.
 */
public class Order{
    private int id;
    private Cart cart;
    private double total = 0.0;
    private MethodOfPayment methodOfPayment;
    private boolean processed = false;
    private boolean delivered = false;

    /**
     * Constructor for the Order class.
     * @param id
     * @param cart
     * @param methodOfPayment
     */
    public Order(int id, Cart cart, MethodOfPayment methodOfPayment) {
        this.id = id;
        this.cart = cart;
        this.methodOfPayment = methodOfPayment;
        this.sumPrices();
    }

    /**
     * Getters for the Order class.
     * @return
     */
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

    /**
     * Method to sum the prices of the products in the cart.
     */
    public void sumPrices() {
        for (Product product : cart.getProducts()) {
            this.total += product.getPrice();
        }
    }

    /**
     * Method to process the order.
     */
    public void processOrder() {
        this.processed = true;
    }

    /**
     * Method to deliver the order.
     */
    public void deliverOrder() {
        this.delivered = true;
    }

    /**
     * Method to return the order as a string.
     */
    public String toString() {
        return "(Order: " + this.id + " Cart: " + this.cart + " Total: " + this.total + " Method of Payment: " + this.methodOfPayment + " Processed: " + this.processed + " Delivered: " + this.delivered + ")";
    }
}