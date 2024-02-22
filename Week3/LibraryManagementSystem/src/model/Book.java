package model;

import model.Library.Section;

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
