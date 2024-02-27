/**
 * Represents a car with its model, year, price and availability.
 * @author Julian Florez
 * @version 1.0
 */

package car_dealer;


public class Car {

    /**
     * Creates a car with its model, year, price and availability.
     * @param model the car's model
     * @param year the car's year
     * @param price the car's price
     * @param availability the car's availability
     */

    private String model;
    private short year;
    private double price;
    private boolean availability;

    public Car(String model, short year, double price, boolean availability) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.availability = availability;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
