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
    
    public String getName() {
        return name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return "(Name: " + name + ", Teacher: " + teacher + ")";
    }
}
