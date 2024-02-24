package shoppingPackage;

public class Shop {
    public static void main(String[] args){
        // Create a product
        Product product = new Product();
        Product product2 = new Product();
        // Create a customer
        Customer customer = new Customer();
        // Create a order
        Order order = new Order();
        // Create a Cart
        Cart cart = new Cart();
        // Create a Payment
        MethodOfPayment methodOfPayment = new MethodOfPayment();

        //add a new product
        
        product.addProduct("Iphone 12", 1, 1000, 10 ,"Electronics");
        product2.addProduct("Iphone 11", 2, 800, 10 ,"Electronics");
        //add a new customer
        customer.addCustomer("John Doe", "email@shop", "123 Bogota", 123456789);
        //add a new Cart
        cart.addCart(customer);
        cart.addProduct(product);
        System.out.println(cart.products.size());
        cart.addProduct(product2);
        System.out.println(cart.products.size());
        //add a new method of payment
        methodOfPayment.addMethodOfPayment(customer, "Credit card", "123456789", "12/25", "123");
        //add a new order
        order.addOrder(1,cart, methodOfPayment);
        System.out.println("Order ID: " + order.id);
        System.out.println("Customer: " + order.cart.customer.name);
        System.out.println("Product: " + order.cart.products.get(0).name);
        System.out.println("Total: " + order.total);
        System.out.println("Method of payment: " + order.methodOfPayment.type);
        System.out.println("Processed: " + order.processed);
        System.out.println("Delivered: " + order.delivered);
        order.processOrder();
        System.out.println("Processed: " + order.processed);
        order.deliverOrder();
        System.out.println("Delivered: " + order.delivered);
    }

}
