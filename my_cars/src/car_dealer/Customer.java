/**
 * 
 */
package car_dealer;

/**
 * It represents a customer interested in buying a car.
 * @author AEROJASH
 * @version 1.0
 */
public class Customer {
	
	public final int MX_FAVS = 3; //The maximum number of favorite models
	
	private String name; 
	private String phoneNumber; 
	private String[] favoriteModels;
	
	
	/**
	 * Creates a customer with attributes such as name, contact and favorite models.
	 * @param name, the customer name
	 * @param phoneNumber, the contact of customer
	 */
	public Customer(String name, String phoneNumber) {		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.favoriteModels = new String[MX_FAVS];
	}


	/**
	 * Obtain the customer name
	 * @return the name of the customer
	 */
	public String getName() {
		return name;
	}


	/**
	 * Update the customer name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Obtain the customer contact number
	 * @return the phoneNumber of the customer
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * Update the customer contact number
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	/**
	 * Add a car model to the favorite list. It does not check
	 * if the model is already included.
	 * @param model, the car model to be add into favorites
	 */
	public void addFavortire(String model) {
		for (int i=0; i<MX_FAVS; i++) {
			if (favoriteModels[i]==null) {
				favoriteModels[i] = model;
				break;
			}
		}
	}

	/**
	 * Represents the Customer into String format
	 */
	public String toString() {
		String tmp = this.name + ". Favorite models: ";
		for (int i=0; i<this.MX_FAVS; i++) {
			if (favoriteModels[i]!=null) 
				tmp += this.favoriteModels[i] + "; ";
			else if (i==0)
				tmp += "None.";
		}
		return tmp;
	}
	
	
}
