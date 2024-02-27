package car_dealer;

public class Main{

    public static void main(String[] args) {
        
        Inventory myCars = new Inventory((short) 5);

        Car car1 = new Car("Twingo", (short) 2010, 10000000.0, true);
        Car car2 = new Car("Sandero", (short) 2015, 40000000.0, true);
        Car car3 = new Car("Optra", (short) 2009, 30000000.0, true);
        Car car4 = new Car("Logan", (short) 2016, 20000000.0, true);
        Car car5 = new Car("Twingo", (short) 2011, 6000000.0, true);

        myCars.addCar(car1);
        myCars.addCar(car2);
        myCars.addCar(car3);
        myCars.addCar(car4);
        myCars.addCar(car5);

        System.out.println(myCars);
    }

}