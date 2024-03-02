package fitnessPackage;

public class Goal {
    private int target_weight;
    private String deadline;

    public Goal(int target_weight, String deadline) {
        this.target_weight = target_weight;
        this.deadline = deadline;
    }

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

    public String toString(){
        return "(Target Weight: " + target_weight + ", Deadline: " + deadline + ")";
    }
}
