package model;
import java.util.ArrayList;

public class Library {

    public static void main() {
        // Create a new section
        Section section = new Section();
        // Create a new book
        Book book = new Book();
        // Create a new member
        Member member = new Member();
        // Create a new librarian
        Librarian librarian = new Librarian();

        // Add a new section
        section.addSection("Science Fiction", 1, "First floor", new ArrayList<Book>());
        // Add a new book
        book.addBook("The Hobbit", "J.R.R. Tolkien", 300, 1, "978-3-16-148410-0", "Houghton Mifflin Harcourt", "Tolkien Collection", "Fantasy", "First floor", true, section);
        // Add a new member
        member.addMember("John Doe", 1, "jd@lib");
        // Add a new librarian
        librarian.addLibrarian("Jane Doe", 1, section, "Morning");
        
        System.out.println(book.name);

    }

}