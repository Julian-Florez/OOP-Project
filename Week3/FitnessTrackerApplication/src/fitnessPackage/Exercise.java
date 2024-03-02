package fitnessPackage;
/**
 * Exercise class to store the details of the exercise
 * @param exercise_name name of the exercise
 * @param exercise_type type of the exercise
 * @param duration duration of the exercise
 * @param calories_burnt calories burnt during the exercise
 */
public class Exercise {
    private String exercise_name;
    private String exercise_type;
    private int duration;
    private double calories_burnt;
    
    /**
     * Constructor to initialize the exercise details
     * @param exercise_name
     * @param exercise_type
     * @param duration
     * @param calories_burnt
     */
    public Exercise(String exercise_name, String exercise_type, int duration, double calories_burnt) {
        this.exercise_name = exercise_name;
        this.exercise_type = exercise_type;
        this.duration = duration;
        this.calories_burnt = calories_burnt;
    }


    /**
     * Getters and Setters for the Exercise class
     * @return
     */
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


    /**
     * toString method to display the details of the exercise
     * @return
     */
    public String toString(){
        return "(Exercise Name: " + exercise_name + ", Exercise Type: " + exercise_type + ", Duration: " + duration + ", Calories Burnt: " + calories_burnt + ")";
    }
}
