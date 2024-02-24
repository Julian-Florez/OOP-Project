package libraryPackage;

public class Librarian {
    String name;
    int id;
    Section section;
    String schedule;

    public Librarian addLibrarian(String name, int id, Section section, String schedule) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.schedule = schedule;
        return this;
    }
}
