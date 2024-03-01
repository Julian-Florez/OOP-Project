package restaurantPackage;

public class Restaurant {
    public static void main(String[] args) {
        // Create a new menu
        Menu menu = new Menu();
        Staff_member staff1 = new Staff_member("John", 1, "Manager", "Monday");
        // Create a new item
        Item item1 = new Item("Burger", "A delicious burger", 5.99, "Main", true, menu);
        // Create a new item
        Item item2 = new Item("Fries", "A delicious side of fries", 2.99, "Side", true, menu);
        // Create a new item
        Item item3 = new Item("Soda", "A refreshing soda", 1.99, "Drink", true, menu);
        // Create a new item
        Item item4 = new Item("Salad", "A healthy salad", 4.99, "Main", true, menu);
        // Create a new item
        Item item5 = new Item("Ice Cream", "A delicious dessert", 3.99, "Dessert", true, menu);
        // Create a new item
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 2);
        Customer customer1 = new Customer("John", "123-456-7890", 1, table1);
        Customer customer2 = new Customer("Jane", "123-456-7890", 2, table1);
        Customer customer3 = new Customer("Jack", "123-456-7890", 3, table1);
        Order order1 = new Order(1, table1);
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);
        order1.addItem(item4);
        System.out.println(table1);

        item5.setPrice(0.99);
        System.out.println(item5);

        customer1.setPhone_number("098-765-4321");
        customer2.setTable(table2);
        customer3.setTable(table2);

        System.out.println(staff1);
    }
}
