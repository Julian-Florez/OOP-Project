package schoolPackage;

public class Grade {
    private Subject subject;
    private double grade;
    private Student student;

    /**
     * Constructor for the Grade class.
     * @param subject
     * @param grade
     * @param student
     */

    public Grade(Subject subject, double grade, Student student) {
        this.subject = subject;
        this.grade = grade;
        this.student = student;
        student.addGrade(this);
    }
    

    /**
     * Getters and Setters for the Grade class.
     */
    public Subject getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * toString method for the Grade class.
     */
    public String toString() {
        return "(Subject: " + subject + ", Grade: " + grade + ")";
    }
}
