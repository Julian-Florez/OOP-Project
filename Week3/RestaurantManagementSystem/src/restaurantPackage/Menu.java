package restaurantPackage;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> item_list;

    /**
     * Constructor for the Menu class.
     */
    public Menu() {
        this.item_list = new ArrayList<Item>();
    }

    /**
     * Getters and Setters for the Menu class.
     * @return
     */

    public ArrayList<Item> getItem_list() {
        return item_list;
    }

    public void addItem(Item item) {
        item_list.add(item);
    }

    public void removeItem(Item item) {
        item_list.remove(item);
    }

    /**
     * toString method for the Menu class.
     */
    public String toString() {
        return "(Menu: " + item_list + ")";
    }
}
