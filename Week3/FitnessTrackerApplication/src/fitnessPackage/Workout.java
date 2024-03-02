package fitnessPackage;
import java.util.ArrayList;

public class Workout {
    private String workout_name;
    private User user;
    private ArrayList<Exercise> exercises;
    private int total_duration;
    private int total_calories_burnt;

    public Workout(String workout_name, User user, ArrayList<Exercise> exercises) {
        this.workout_name = workout_name;
        this.user = user;
        this.exercises = exercises;
        this.total_duration = 0;
        this.total_calories_burnt = 0;
    }

    public String getWorkout_name() {
        return workout_name;
    }

    public User getUser() {
        return user;
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
        total_duration += exercise.getDuration();
        total_calories_burnt += exercise.getCalories_burnt();
    }

    public void removeExercise(Exercise exercise) {
        exercises.remove(exercise);
        total_duration -= exercise.getDuration();
        total_calories_burnt -= exercise.getCalories_burnt();
    }

    public String toString(){
        return "(Workout Name: " + workout_name + ", User: " + user + ", Total Duration: " + total_duration + ", Total Calories Burnt: " + total_calories_burnt +", Exercises: "+ exercises +")";
    }
}
