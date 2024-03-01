package taskManager;

public class Task {
    // Fields representing attributes of a task
    private String title;
    private String description;
    private boolean status;
    private String dueDate;
    private double grade;

    // Constructor to initialize a Task object with provided values
    public Task(String title, String description, boolean status, String dueDate, double grade) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.grade = grade;
    }

    // Getter method to retrieve the title of the task
    public String getTitle() {
        return this.title;
    }

    // Getter method to retrieve the description of the task
    public String getDescription() {
        return this.description;
    }

    // Getter method to retrieve the status of the task (completed or not)
    public boolean getStatus() {
        return this.status;
    }

    // Getter method to retrieve the due date of the task
    public String getDueDate() {
        return this.dueDate;
    }

    // Getter method to retrieve the grade associated with the task
    public double getGrade() {
        return this.grade;
    }

    // Setter method to update the status of the task
    public void setStatus(boolean status) {
        this.status = status;
    }

    // Setter method to update the grade associated with the task
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
