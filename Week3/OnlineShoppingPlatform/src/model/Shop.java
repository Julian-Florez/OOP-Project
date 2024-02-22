package model;
import java.util.ArrayList;

public class Shop {

    public class Customer{
        private String name;
        private String email;
        private String address;
        private int id;
        private ArrayList<Order> orders = new ArrayList<Order>();

        public Customer addCustomer(String name, String email, String address, int id) {
            this.name = name;
            this.email = email;
            this.address = address;
            this.id = id;
            return this;
        }

        public void addOrder(Order order) {
            this.orders.add(order);
        }
    }

    public class Product{
        private String name;
        private int id;
        private double price;
        private int stock;
        private String category;

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
    public class Cart{
        private Customer customer;
        private ArrayList<Product> products = new ArrayList<Product>();

        public Cart addCart(Customer customer) {
            this.customer = customer;
            return this;
        }
        
        public void addProduct(Product product) {
            this.products.add(product);
        }
    }

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
    
    public class MethodOfPayment{
        private Customer customer;
        private String type;
        private String number;
        private String expirationDate;
        private String cvv;

        public MethodOfPayment addMethodOfPayment(Customer customer, String type, String number, String expirationDate, String cvv) {
            this.customer = customer;
            this.type = type;
            this.number = number;
            this.expirationDate = expirationDate;
            this.cvv = cvv;
            return this;
        }

        public void updateMethodOfPayment(String type, String number, String expirationDate, String cvv) {
            this.type = type;
            this.number = number;
            this.expirationDate = expirationDate;
            this.cvv = cvv;
        }
    }

    public static void main(String[] args) {
        // Create a new Shop
        Shop shop = new Shop();
        // Create a new Customer
        Shop.Customer customer = shop.new Customer().addCustomer("John Doe", "jd@shop.com", "123 Main St", 1234567890);
        System.out.println(customer.name);
        // Create Products
        Shop.Product product1 = shop.new Product().addProduct("Product 1", 1, 150.00, 10, "Category 1");
        Shop.Product product2 = shop.new Product().addProduct("Product 2", 2, 200.00, 20, "Category 2");
        System.out.println(product1.name);
        System.out.println(product2.price);
        // Create a new Cart
        Shop.Cart cart = shop.new Cart().addCart(customer);
        System.out.println(cart.products.size());
        // Add Products to Cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        System.out.println(cart.products.size());
        // Create a new MethodOfPayment
        Shop.MethodOfPayment methodOfPayment = shop.new MethodOfPayment().addMethodOfPayment(customer, "Credit Card", "378282246310005", "12/23", "123");
        System.out.println(methodOfPayment.type);
        // Create a new Order
        Shop.Order order = shop.new Order().addOrder(1, cart, methodOfPayment);
        System.out.println(order.total);
        // Add Order to Customer
        customer.addOrder(order);
        System.out.println(customer.orders.size());
        // Process Order
        order.processOrder();
        System.out.println(order.processed);
        // Deliver Order
        order.deliverOrder();
        System.out.println(order.delivered);


    }
}
