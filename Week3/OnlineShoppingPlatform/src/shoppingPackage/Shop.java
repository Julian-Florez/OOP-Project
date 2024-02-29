package shoppingPackage;

public class Shop {
    public static void main(String[] args){
        // Create products
        Product product = new Product("Iphone 12", 1, 1000, 10 ,"Electronics");
        Product product2 = new Product("Iphone 11", 2, 800, 10 ,"Electronics");
        
        // Create a customer
        Customer customer = new Customer("John Doe", "email@shop", "123 Bogota", 123456789);

        // Create a Cart
        Cart cart = new Cart(customer);
        
        // Create a Payment method
        MethodOfPayment methodOfPayment = new MethodOfPayment(customer, "Credit card", "123456789", "12/25", "123");

        //add products to the cart
        cart.addProduct(product);
        System.out.println(cart.getProducts().size());
        cart.addProduct(product2);
        System.out.println(cart.getProducts().size());
 
        // Create a order
        Order order = new Order(1,cart, methodOfPayment);

        // Test the methods
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer: " + order.getCart().getCustomer().getName());
        System.out.println("Product: " + order.getCart().getProducts().get(0).getName());
        System.out.println("Total: " + order.getTotal());
        System.out.println("Method of payment: " + order.getMethodOfPayment().getType());
        System.out.println("Processed: " + order.getProcessed());
        System.out.println("Delivered: " + order.getDelivered());
        order.processOrder();
        System.out.println("Processed: " + order.getProcessed());
        order.deliverOrder();
        System.out.println("Delivered: " + order.getDelivered());
        System.out.println(order);
    }

}
