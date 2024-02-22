package model;
import model.Book;
import java.util.ArrayList;

public class Section {
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