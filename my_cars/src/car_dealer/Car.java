/**
 * 
 */
package car_dealer;

import java.text.NumberFormat;

/**
 * It represents a car with attributes such as model, year, price, and availability.
 * @author AEROJASH
 * @version 1.0
 */
public class Car {

	private String model;
	private int year;
	private double price;
	private boolean availability;
	
	
	/**
	 * Creates a car with attributes such as model, year, price, and availability
	 * @param model
	 * @param year
	 * @param price
	 * @param availability
	 */
	public Car(String model, int year, double price, boolean availability) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		this.availability = availability;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @return the availability
	 */
	public boolean isAvailability() {
		return availability;
	}
	
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	/**
	 * @return the car model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @return the year of manufacture of the car
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Represents a car into String format
	 */
	public String toString() {
		return this.model + "-" +this.year;
	}
	
	/**
	 * Show by standard console a car with its price
	 */
	public void exhibit () {
		
		//Get a currency formatter for the current locale.
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("        *"+this.model+"*");
		System.out.println("          _______");
		System.out.println("         //  ||\\ \\");
		System.out.println("   _____//___||_\\ \\__");
		System.out.println("  )  _          _    \\");
		System.out.println("  |_/ \\________/ \\___/");
		System.out.println("____\\_/________\\_/_______");
		System.out.println("     "+fmt.format(this.price));
	}
	
}
