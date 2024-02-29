/**
 * 
 */
package car_dealer;

/**
 * Manages the inventory of cars, allowing operations like adding and removing a car, 
 * and searching for cars based on criteria (e.g., model), and displaying available cars.
 * @author AEROJASH
 * @version 1.0
 */
public class Inventory {

	private int capacity;
	private Car[] cars;
	private int valet; 
	
	
	/**
	 * Creates an instance of an inventory of cars
	 * @param capacity
	 */
	public Inventory(int cap) {
		this.capacity = cap;
		this.valet = 0; 
		this.cars = new Car [cap];
	}


	/**
	 * How many cars are there in the car dealer?
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * Add a car to the inventory
	 * @param car
	 */
	public void addCar(Car car) {
		cars[this.valet] = car;
		valet += 1;
	}
	
	/**
	 * Remove a car from the inventory. 
	 * Note that the search criterion is the object reference.  
	 * @param car, it an object that represents a car.
	 * @return true, is the car is removed; false, in the contrary case.
	 */
	public boolean removeCar(Car car) {
		boolean find = false;
		for (int i=0; i<cars.length; i++) {
			if (cars[i].equals(car)){
				find = true;
				cars[i] = null;
			}
		}
		
		return find;
	}
	
	/**
	 * Search a car that matches with the model given by parameter
	 * @param model is a String with the model of the car to compare
	 * @return Car, it corresponds with the first match found. 
	 * 		   A null value is returned when there are no coincidences. 
	 */
	public Car searchCarByModel (String model) {
		
		Car tmpCar = null;
		
		for (int i=0; i<this.capacity; i++) {
			if (cars[i].getModel() == model) {
				tmpCar =cars[i];
			}
		}
		
		return tmpCar;
		
	}
	
	/**
	 * Represents the inventory into String format
	 */
	public String toString() {
		String tmp = "";
		for (int i=0; i<this.capacity; i++) {
			tmp += cars[i] + "\n";
		}
		return tmp;
	}
	
	
}
