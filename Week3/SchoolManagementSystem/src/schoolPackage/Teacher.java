package schoolPackage;
import java.util.ArrayList;
/**
 * This class represents a teacher in the school.
 * A teacher has a name, an id, a list of classrooms, a list of schedules and a subject.
 * A teacher only has a subject, and can be added to different classrooms and have schedules added to their list of schedules.
 */
public class Teacher {
    private String name;
    private int id;
    private ArrayList<Classroom> classrooms;
    private ArrayList<Schedule> schedule;
    private Subject subject;

    /**
     * Constructor for the Teacher class.
     * @param name
     * @param id
     * @param subject
     */
    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
        this.subject = null;
        this.classrooms = new ArrayList<Classroom>();
        this.schedule = new ArrayList<Schedule>();
    }

    /**
     * Getters and setters for the Teacher class.
     * @return
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public ArrayList<Schedule> getSchedule() {
        return schedule;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * Method to add a classroom to the list of classrooms for the teacher.
     * @param classroom
     */
    public void addClassroom(Classroom classroom) {
        this.classrooms.add(classroom);
    }

    /**
     * Method to add a schedule to the list of schedules for the teacher.
     * @param schedule
     */
    public void addSchedule(Schedule schedule) {
        this.schedule.add(schedule);
    }

    public String toString() {
        return "(Name: " + name + " ID: " + id + ")";
    }
}
