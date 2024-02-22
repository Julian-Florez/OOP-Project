package model;
import java.util.ArrayList;

import model.Book;

public class Member {
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