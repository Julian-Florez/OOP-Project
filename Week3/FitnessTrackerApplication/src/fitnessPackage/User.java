package fitnessPackage;

public class User {
    private String name;
    private int id;
    private String contact_number;
    private double weight;
    private double height;
    private int age;
    private double bmi;

    public User(String name, int id, String contact_number, double weight, double height, int age) {
        this.name = name;
        this.id = id;
        this.contact_number = contact_number;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.bmi = calculateBMI();
    }

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

    public double calculateBMI() {
        return (weight / (height * height));
    }

    public String toString() {
        return "(Name: " + name + ", ID: " + id + ", Contact Number: " + contact_number + ", Weight: " + weight + " kg, Height: " + height + " m, Age: " + age + " years, BMI: " + bmi + ")";
    }
    
}
