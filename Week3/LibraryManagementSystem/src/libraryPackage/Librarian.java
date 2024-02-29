package libraryPackage;

/**
 * This class represents a librarian in the library.
 * It contains the librarian's name, id, section and schedule.
 * It also contains methods to set the section and schedule of a librarian.
 */

public class Librarian {
    private String name;
    private int id;
    private Section section;
    private String schedule;

    /**
     * Constructor for the Librarian class.
     * @param name
     * @param id
     * @param section
     * @param schedule
     */
    public Librarian(String name, int id, Section section, String schedule) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.schedule = schedule;
    }


    /**
     * Getters and setters for the Librarian class.
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Section getSection() {
        return section;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setId(int id) {
        this.id = id;
    }
}
