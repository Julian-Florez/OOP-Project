/**
 * Class that represents the inventory of the car dealer, with its cars and quantity, and methods to add, remove and search cars by model.
 * @author Julian Florez
 * @version 1.0
 */

package car_dealer;

public class Inventory {

    private Car[] cars;
    private short carsQuantity;
    private short setter;

    public Inventory(short carsQuantity) {
        this.carsQuantity = carsQuantity;
        this.setter = 0;
        this.cars = new Car[carsQuantity];
    }


    /**
     * Returns the quantity of cars in the inventory.
     * @return
     */
    public short getQuantityCars(){
        return carsQuantity;
    }
    
    /**
     * Adds a car to the inventory.
     * @param car
     */
    public void addCar(Car car){
        cars[this.setter] = car
        setter += 1;
    }

    /**
     * Removes a car from the inventory.
     * @param car
     * @return
     */
    public boolean removeCar(Car car){
        for (int i=0; i<cars.length; i++){
            if (cars[i].equals(car)){
                find = true;
                cars[i] = null;
            }
        }

        return find;
    }
    
    /**
     * Searches a car by its model.
     * @param model
     * @return
     */
    public Car searchCarByModel(String model){
        //for (int=0, i<cars.length; i++){
        for (int i=0; i<this.carsQuantity; i++){
            //if (cars[i].getModel().equals(model)){
            if (cars[i].getModel()==model){
                return cars[i];
            }
            else{
                return null;
            }
        }
    }
}