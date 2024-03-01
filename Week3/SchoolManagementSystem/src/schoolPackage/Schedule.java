package schoolPackage;

public class Schedule {
    private String day;
    private String time;
    private Subject subject;
    private Classroom classroom;

    /**
     * Constructor for the Schedule class.
     * @param day
     * @param time
     * @param subject
     * @param classroom
     */
    public Schedule(String day, String time, Subject subject, Classroom classroom) {
        this.day = day;
        this.time = time;
        this.subject = subject;
        this.classroom = classroom;
        addScheduleToTeacher(subject.getTeacher());
        addScheduleToClassroom(classroom);
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public Subject getSubject() {
        return subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void addScheduleToTeacher(Teacher teacher) {
        teacher.addSchedule(this);
    }

    public void addScheduleToClassroom(Classroom classroom) {
        for (Student student : classroom.getStudents()) {
            student.addSchedule(this);
        }
    }

    public String toString() {
        return "(Day: " + day + ", Time: " + time + ", Subject: " + subject.getName() + ")";
    }
}
