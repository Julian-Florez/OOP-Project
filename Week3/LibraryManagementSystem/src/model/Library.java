package model;
import java.util.ArrayList;
import model.Section;
import model.Book;
import model.Member;
import model.Librarian;

public class Library {
    public static void main(String[] args) {
       Library library = new Library();

        //sections 
        Section section_classic= (library.new Section()).addSection("Clásicos", 0, "A1", new ArrayList<Book>());

        //books
        (library.new Book()).addBook("El principito", "Antoine de Saint-Exupéry", 96, 0, "9783140464079", "Emecé", "Clásicos", "Ficción", "A11", true, section_classic);
        (library.new Book()).addBook("El hobbit", "J.R.R. Tolkien", 304, 1, "9788445074873", "Minotauro", "Clásicos", "Ficción", "A12", true, section_classic);
        
        //members
        Member member1 = (library.new Member()).addMember("Julian", 1000733453, "julian@library.com");


        //librarians
        Librarian librarian1 = (library.new Librarian()).addLibrarian("Pedro", 1, section_classic, "Lunes a viernes 8:00 a 16:00");

        //tests
        System.out.println(section_classic.books.get(1).name);
        System.out.println(section_classic.books.get(0).name);

        member1.borrowBook(section_classic.books.get(0));
        member1.borrowBook(section_classic.books.get(1));
        System.out.println(member1.name+" "+member1.id+" "+member1.email);
        System.out.println(member1.borrowedBooks.get(0).name+" "+section_classic.books.get(0).avaliability);
        System.out.println(member1.borrowedBooks.size());

        member1.returnBook(member1.borrowedBooks.get(0));
        System.out.println(member1.borrowedBooks.size()+" "+section_classic.books.get(0).avaliability);

        System.out.println(librarian1.name+" "+librarian1.id+" "+librarian1.section.name+" "+librarian1.schedule);
    }

}