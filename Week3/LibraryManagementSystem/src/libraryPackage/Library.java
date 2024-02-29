package libraryPackage;
import java.util.ArrayList;


/**
 * This class represents the library.
 * It contains the main method to test the library.
 * It creates a new section, member, librarian and book.
 * It also tests the borrow and return book methods.
 */
public class Library {

    public static void main(String[] args){
        
        // Create a new section
        Section section = new Section("Science Fiction", 1, "First floor", new ArrayList<Book>());
        // Create a new member
        Member member = new Member("John Doe", 1, "jd@lib");
        // Create a new librarian
        Librarian librarian = new Librarian("Jane Doe", 1, section, "Morning");
        // Add a new book
        new Book("The Hobbit", "J.R.R. Tolkien", 300, 1, "978-3-16-148410-0", "Houghton Mifflin Harcourt", "Tolkien Collection", "Fantasy", "First floor", true, section);
        // Add a new member
        

        System.out.println(section.getBooks().get(0).getAvaliability());
        member.borrowBook(section.getBooks().get(0));

        System.out.println(librarian);
        System.out.println(member.getName());
        System.out.println(section.getBooks().get(0).getAvaliability());
        System.out.println(member.getBorrowedBooks().get(0).getName());
        System.out.println(member);
        System.out.println(section.getBooks().get(0));
        System.out.println(section);
    }

}