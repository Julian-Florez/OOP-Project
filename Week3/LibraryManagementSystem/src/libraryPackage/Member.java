package libraryPackage;
import java.util.ArrayList;

/**
 * This class represents a member in the library.
 * It contains the member's name, id and email.
 * It also contains methods to add, borrow and return a book.
 */
public class Member {

    private String name;
    private int id;
    private String email;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Member(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        (book).lentBook();
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        book.returnBook();
    }
}
