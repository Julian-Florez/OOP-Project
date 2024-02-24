package libraryPackage;
import java.util.ArrayList;

public class Member {

    String name;
    int id;
    String email;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Member addMember(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        return this;
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
