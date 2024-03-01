package restaurantPackage;

public class Staff_member {
    private String name;
    private int id;
    private String role;
    private String schedule;

    /**
     * Constructor for the Staff_member class.
     * @param name
     * @param id
     * @param role
     * @param schedule
     */
    public Staff_member(String name, int id, String role, String schedule) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.schedule = schedule;
    }

    /**
     * Getters and Setters for the Staff_member class.
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * toString method for the Staff_member class.
     */

    public String toString() {
        return "(Name: " + name + ", ID: " + id + ", Role: " + role + ", Schedule: " + schedule + ")";

    }
}
