package model;

public class Book {

    String name;
    String author;
    int pages;
    int id;
    String isbn;
    String editorial;
    String collection;
    String category;
    String location;
    boolean avaliability;
    Section section;

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
