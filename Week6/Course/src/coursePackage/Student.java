package coursePackage;
import java.util.ArrayList;
public class Student {

    /**
     * Student class
     * @param name: Student's name
     * @param surname: Student's surname
     * @param dni: Student's DNI
     * @param grades: List of student's grades
     */

    private String name;
    private String surname;
    private String dni;
    private ArrayList<Double> grades;

    public Student(String name, String surname, String dni, ArrayList<Double> grades) {

        /**
         * Constructor
         * @param name: Student's name
         * @param surname: Student's surname
         * @param dni: Student's DNI
         * @param grades: List of student's grades
         */

        this.name = name;
        this.surname = surname;
        this.dni = dni;
        if (grades.size() <= 10){
            this.grades = grades;
        } else {
            System.out.println("The student can't have more than 10 grades");
        }
    }
    
    public String getName() {

        /**
         * Returns the student's name
         * @return String
         */

        return name;
    }

    public String getSurname() {

        /**
         * Returns the student's surname
         * @return String
         */

        return surname;
    }

    public String getDni() {

        /**
         * Returns the student's DNI
         * @return String
         */

        return dni;
    }

    public ArrayList<Double> getGrades() {

        /**
         * Returns the student's grades
         * @return ArrayList<Double>
         */

        return grades;
    }
}
