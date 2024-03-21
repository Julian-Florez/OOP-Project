import java.util.ArrayList;
public class Student {

    private String name;
    private String surname;
    private String dni;
    private ArrayList<Double> grades;

    public Student(String name, String surname, String dni, ArrayList<Double> grades) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    
}
