package taskManager;

public class Task{
    private String title;
    private String description;
    private boolean status;
    private String due_date;
    private double grade;

    public Task(String title, String description, boolean status, String due_date, double grade){
        this.title = title;
        this.description = description;
        this.status = status;
        this.due_date = due_date;
        this.grade = grade;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }   

    public boolean getStatus(){
        return this.status;
    }

    public String getDueDate(){
        return this.due_date;
    }

    public double getGrade(){
        return this.grade;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public String toString(){
        return "Title: " + this.title + ", Description: " + this.description + ", Status: " + this.status + ", Due Date: " + this.due_date + ", Grade: " + this.grade;
    }
}