package model;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Shop {
    public static void main(){
        // Create a product
        Product product = new Product();
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
        //add a new customer
        customer.addCustomer("John Doe", "email@shop", "123 Bogota", 123456789);
        //add a new Cart
        cart.addCart(customer);
        cart.addProduct(product);
        //add a new method of payment
        methodOfPayment.addMethodOfPayment(customer, "Credit card", "123456789", "12/25", "123");
        //add a new order
        order.addOrder(1,cart, methodOfPayment);
        System.out.println("Order ID: " + order.id);



    }

}
