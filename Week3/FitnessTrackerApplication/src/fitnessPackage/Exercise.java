package fitnessPackage;

public class Exercise {
    private String exercise_name;
    private String exercise_type;
    private int duration;
    private double calories_burnt;
    
    public Exercise(String exercise_name, String exercise_type, int duration, double calories_burnt) {
        this.exercise_name = exercise_name;
        this.exercise_type = exercise_type;
        this.duration = duration;
        this.calories_burnt = calories_burnt;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public String getExercise_type() {
        return exercise_type;
    }

    public int getDuration() {
        return duration;
    }

    public double getCalories_burnt() {
        return calories_burnt;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCalories_burnt(double calories_burnt) {
        this.calories_burnt = calories_burnt;
    }

    public void setExercise_type(String exercise_type) {
        this.exercise_type = exercise_type;
    }

    public String toString(){
        return "(Exercise Name: " + exercise_name + ", Exercise Type: " + exercise_type + ", Duration: " + duration + ", Calories Burnt: " + calories_burnt + ")";
    }
}
