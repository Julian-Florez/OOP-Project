package schoolPackage;
import java.util.ArrayList;
/**
 * This class represents a student in the school.
 * A student has a name, an id, a classroom, a list of grades and a list of schedules.
 * A student can be added to a classroom, can have grades added to their list of grades and can have schedules added to their list of schedules.
 */


public class Student {
    private String name;
    private ArrayList<Grade> grades;
    private double meanGrade;
    private int id;
    private Classroom classroom;
    private ArrayList<Schedule> schedule;

    /**
     * Constructor for the Student class.
     * @param name
     * @param id
     * @param classroom
     */
    public Student(String name, int id, Classroom classroom) {
        this.name = name;
        this.id = id;
        this.classroom = classroom;
        this.grades = new ArrayList<Grade>();
        this.meanGrade = 0;
        this.schedule = new ArrayList<Schedule>();
        addStudentToClassroom(classroom);
        calcMeanGrade();
    }

    /**
     * Getters and setters for the Student class.
     * @return
     */
    public String getName() {
        return name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public int getId() {
        return id;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public ArrayList<Schedule> getSchedule() {
        return schedule;
    }
    
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    /**
     * Method to add a grade to the list of grades for the student.
     * @param grade
     */
    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    /**
     * Method to add a schedule to the list of schedules for the student.
     * @param schedule
     */
    public void addSchedule(Schedule schedule) {
        this.schedule.add(schedule);
    }

    public void addStudentToClassroom(Classroom classroom) {
        classroom.addStudent(this);
    }

    /**
     * Method to calculate the mean grade for the student.
     */
    public void calcMeanGrade(){
        for (Grade grade : grades) {
            this.meanGrade += grade.getGrade();
        }
    }
    
    /**
     * Method to return a string representation of the student.
     * @return
     */
    public String toString() {
        return "(Name: " + name + " ID: " + id + " Classroom: " + classroom.getId()+" Grades: " + grades + " Schedule: "+ schedule +")";
    }
}
