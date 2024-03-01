package restaurantPackage;

public class Item {
    private String item_name;
    private String description;
    private double price;
    private String category;
    private boolean availability;
    private Menu menu;

    /**
     * Constructor for the Item class.
     * @param item_name
     * @param description
     * @param price
     * @param category
     * @param availability
     * @param menu
     */
    public Item(String item_name, String description, double price, String category, boolean availability, Menu menu) {
        this.item_name = item_name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.availability = availability;
        this.menu = menu;
        menu.addItem(this);
    }

    /**
     * Getters and Setters for the Item class.
     * @return
     */
    public String getItem_name() {
        return item_name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean getAvailability() {
        return availability;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * toString method for the Item class.
     */
    public String toString() {
        return "(Name: " + item_name + ", Description: " + description + ", Price: " + price + ", Category: " + category + ", Availability: " + availability + ")";
    }
}
