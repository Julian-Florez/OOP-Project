package fitnessPackage;
/**
 * Goal class to store the details of the goal
 * @param target_weight target weight to be achieved
 * @param deadline deadline to achieve the target weight
 */
public class Goal {
    private int target_weight;
    private String deadline;

    /**
     * Constructor to initialize the goal details
     * @param target_weight
     * @param deadline
     */
    public Goal(int target_weight, String deadline) {
        this.target_weight = target_weight;
        this.deadline = deadline;
    }

    /**
     * Getters and Setters for the Goal class
     * @return
     */
    public int getTarget_weight() {
        return target_weight;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setTarget_weight(int target_weight) {
        this.target_weight = target_weight;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * toString method to display the goal details
     * @return
     */
    public String toString(){
        return "(Target Weight: " + target_weight + ", Deadline: " + deadline + ")";
    }
}
