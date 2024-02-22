package model;

public class Librarian {
    private String name;
    private int id;
    private Section section;
    private String schedule;

    public Librarian addLibrarian(String name, int id, Section section, String schedule) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.schedule = schedule;
        return this;
    }
}
