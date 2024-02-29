package libraryPackage;
/** 
 * This class represents a book in the library.
 * It contains the book's name, author, pages, id, isbn, editorial, collection, category, location, avaliability and section.
 * It also contains methods to lent and return a book.
*/
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
    boolean avaliability;
    private Section section;

    /**
     * Constructor for the Book class.
     * @param name
     * @param author
     * @param pages
     * @param id
     * @param isbn
     * @param editorial
     * @param collection
     * @param category
     * @param location
     * @param avaliability
     * @param section
     */
    public Book(String name, String author, int pages, int id, String isbn ,String editorial, String collection, String category, String location, boolean avaliability, Section section) {
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
    }  

    /**
     * Getters and setters for the Book class.
     */
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getId() {
        return id;
    }

    public String getISBN() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCollection() {
        return collection;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public boolean getAvaliability() {
        return avaliability;
    }

    public Section getSection() {
        return section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    /**
     * Method to print the book's name and author.
     */
    public String toString() {
       return ("(Book: " + this.name + ", Author: " + this.author+")");
    }

    /**
     * Methods to lent and return a book.
     */
    public void lentBook() {
        this.avaliability = false;
    }

    public void returnBook() {
        this.avaliability = true;
    }
}
