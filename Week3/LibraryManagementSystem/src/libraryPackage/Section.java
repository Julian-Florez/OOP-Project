package libraryPackage;
import java.util.ArrayList;

public class Section {
    private String name;
    private int id;
    private String location;
    private ArrayList<Book> books;

    public Section(String name, int id, String location, ArrayList<Book> books) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "(Name: " + this.name + ", Id: " + this.id + ", Location: " + this.location + ", Books: " + this.books+")";
    }


}
