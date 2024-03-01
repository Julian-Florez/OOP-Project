package schoolPackage;
import java.util.ArrayList;

public class Classroom {
    private int id;
    private ArrayList<Student> students;

    /**
     * Constructor for the Classroom class.
     * @param id
     */
    public Classroom(int id) {
        this.id = id;
        this.students = new ArrayList<Student>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Method to add a student to the list of students for the classroom.
     * @param student
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Method to remove a student from the list of students for the classroom.
     * @param student
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String toString() {
        return "(ID: " + id + ", Students: " + students + ")";
    }
}
