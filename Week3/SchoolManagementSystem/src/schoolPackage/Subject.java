package schoolPackage;

public class Subject {
    private String name;
    private Teacher teacher;

    /**
     * Constructor for the Subject class.
     * @param name
     */
    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        teacher.setSubject(this);
    }
    
    /**
     * Getters and Setters for the Subject class.
     * @return
     */
    public String getName() {
        return name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * toString method for the Subject class.
     */
    public String toString() {
        return "(Name: " + name + ", Teacher: " + teacher + ")";
    }
}
