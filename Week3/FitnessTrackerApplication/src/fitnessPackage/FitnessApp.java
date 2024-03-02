package fitnessPackage;

public class FitnessApp {
    public static void main(String[] args) {
        User user1 = new User("John Doe", 1, "1234567890", 70, 1.75, 25);
        Exercise exercise1 = new Exercise("Running", "Cardio", 30, 300);
        Exercise exercise2 = new Exercise("Weight Lifting", "Strength", 45, 200);
        Exercise exercise3 = new Exercise("Yoga", "Flexibility", 60, 150);
        Workout workout1 = new Workout("Full Body Workout");
        workout1.addExercise(exercise1);
        workout1.addExercise(exercise2);
        workout1.addExercise(exercise3);
        user1.setWorkout(workout1);
        Goal goal1 = new Goal(65, "2022-12-31");
        user1.setGoal(goal1);
        System.out.println(user1);
    }
}
