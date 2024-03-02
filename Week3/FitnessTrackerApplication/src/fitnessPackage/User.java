package fitnessPackage;

/**
 * User class to store the details of the user
 * @param name name of the user
 * @param id id of the user
 * @param contact_number contact number of the user
 * @param weight weight of the user
 * @param height height of the user
 * @param age age of the user
 * @param bmi bmi of the user
 * @param goal goal of the user
 * @param workout workout of the user
 */
public class User {
    private String name;
    private int id;
    private String contact_number;
    private double weight;
    private double height;
    private int age;
    private double bmi;
    private Goal goal;
    private Workout workout;

    /**
     * Constructor to initialize the user details
     * @param name
     * @param id
     * @param contact_number
     * @param weight
     * @param height
     * @param age
     */
    public User(String name, int id, String contact_number, double weight, double height, int age) {
        this.name = name;
        this.id = id;
        this.contact_number = contact_number;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.bmi = calculateBMI();
        this.goal = null;
        this.workout = null;
    }

    /**
     * Getters and Setters for the User class
     * @return
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getBmi() {
        return bmi;
    }

    public Goal getGoal() {
        return goal;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    /**
     * Method to calculate the BMI of the user
     * @return
     */
    public double calculateBMI() {
        return (weight / (height * height));
    }

    /**
     * toString method to display the user details
     * @return
     */
    public String toString() {
        return "(Name: " + name + ", ID: " + id + ", Contact Number: " + contact_number + ", Weight: " + weight + " kg, Height: " + height + " m, Age: " + age + " years, BMI: " + bmi +", Goal: "+ goal + ", Workout: "+ workout +")";
    }
    
}
