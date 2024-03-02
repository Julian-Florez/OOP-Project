package fitnessPackage;
import java.util.ArrayList;

/**
 * Workout class to store the details of the workout
 * @param workout_name name of the workout
 * @param exercises list of exercises in the workout
 * @param total_duration total duration of the workout
 * @param total_calories_burnt total calories burnt during the workout
 */
public class Workout {
    private String workout_name;
    private ArrayList<Exercise> exercises;
    private int total_duration;
    private int total_calories_burnt;

    /**
     * Constructor to initialize the workout details
     * @param workout_name
     */
    public Workout(String workout_name) {
        this.workout_name = workout_name;
        this.exercises = new ArrayList<Exercise>();
        this.total_duration = 0;
        this.total_calories_burnt = 0;
    }

    /**
     * Getters and Setters for the Workout class
     * @return
     */
    public String getWorkout_name() {
        return workout_name;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public int getTotal_duration() {
        return total_duration;
    }

    public int getTotal_calories_burnt() {
        return total_calories_burnt;
    }

    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }

    /**
     * Method to add an exercise to the workout
     * @param exercise
     */
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
        total_duration += exercise.getDuration();
        total_calories_burnt += exercise.getCalories_burnt();
    }

    /**
     * Method to remove an exercise from the workout
     * @param exercise
     */
    public void removeExercise(Exercise exercise) {
        exercises.remove(exercise);
        total_duration -= exercise.getDuration();
        total_calories_burnt -= exercise.getCalories_burnt();
    }

    /**
     * toString method to display the workout details
     * @return
     */
    public String toString(){
        return "(Workout Name: " + workout_name + ", Total Duration: " + total_duration + ", Total Calories Burnt: " + total_calories_burnt +", Exercises: "+ exercises +")";
    }
}
