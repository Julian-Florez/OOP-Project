/**
 * 
 */
package car_dealer;

/**
 * This class contains the main Java method, which is the point
 * at which the execution of a Java application begins
 * @author AEROJASH
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Inventory myCars = new Inventory(5);
		
		Customer c1 = new Customer ("Alix", "2526231");
		c1.addFavortire("Mini Couper");
		c1.addFavortire("Jeep");
		System.out.println(c1);
		
		Car car1 = new Car("Twingo", 2010, 10000000,true);
		Car car2 = new Car("Sandero", 2015, 40000000.0,true);
		Car car3 = new Car("Optra", 2009, 30000000.0,true);
		Car car4 = new Car("Logan", 2016, 20000000.0,true);
		Car car5 = new Car("Twingo", 2011, 6000000.0,true);
		
		myCars.addCar(car1);
		myCars.addCar(car2);
		myCars.addCar(car3);
		myCars.addCar(car4);
		myCars.addCar(car5);
		
		//Show the model and the  
		System.out.println(myCars);
		
		//Print an ASCII representation of a car in the console.
		car1.exhibit(); //How can you display all the cars?
		
	}

}
