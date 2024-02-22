package model;
import java.util.ArrayList;

public class Library {
    
    public class Book {
        private String name;
        private String author;
        private int pages;
        private int id;
        private String isbn;
        private String editorial;
        private String collection;
        private String category;
        private String location;
        private boolean avaliability;
        private Section section;

        public Book addBook(String name, String author, int pages, int id, String isbn ,String editorial, String collection, String category, String location, boolean avaliability, Section section) {
            this.name = name;
            this.author = author;
            this.pages = pages;
            this.id = id;
            this.isbn = isbn;
            this.editorial = editorial;
            this.collection = collection;
            this.category = category;
            this.location = location;
            this.avaliability = avaliability;
            this.section = section;
            section.addBook(this);
            return this;
        }  

        public void lentBook() {
            this.avaliability = false;
        }

        public void returnBook() {
            this.avaliability = true;
        }
    }

    public class Member{
        private String name;
        private int id;
        private String email;
        private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

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

    public class Librarian{
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

    public class Section{
        private String name;
        private int id;
        private String location;
        private ArrayList<Book> books;

        public Section addSection(String name, int id, String location, ArrayList<Book> books) {
            this.name = name;
            this.id = id;
            this.location = location;
            this.books = books;
            return this;
        }

        public void addBook(Book book) {
            this.books.add(book);
        }
    }

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