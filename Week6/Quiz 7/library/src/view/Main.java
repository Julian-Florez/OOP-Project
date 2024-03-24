/**
 * 
 */
package view;

import model.*;

/**
 * It works as a console interface to show the Library functionality
 */
public class Main {
	
    public static void main(String[] args) {
    	
    	//Create a library object
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, "978-0061120084", "Harper Perennial Modern Classics"));
        library.addBook(new Book("1984", "George Orwell", 1949, 328, "978-0451524935", "Signet Classic"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "978-0743273565", "Scribner"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813, 279, "978-0486284736", "Dover Publications"));
        library.addBook(new Book("To the Lighthouse", "Virginia Woolf", 1927, 209, "978-0156907392", "Harcourt Brace"));
        library.addBook(new Book("Moby-Dick", "Herman Melville", 1851, 623, "978-0142000083", "Penguin Books"));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 277, "978-0316769488", "Little, Brown and Company"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", 1932, 311, "978-0060850524", "Harper Perennial Modern Classics"));
        library.addBook(new Book("The Odyssey", "Homer", -800, 374, "978-0143039952", "Penguin Classics"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 1178, "978-0618640157", "Houghton Mifflin Harcourt"));


        /** IMPORTANT: Keep in mind We can visualize the library by the console 
         *  because the class Library implement the toString() method */    
        //Show by console all books in the library
        System.out.println(library); 
        
        
        //Test of your methods
        System.out.println("Test #1: ");
        System.out.println(library.findBooksByAuthor("Harper Lee"));
        
        System.out.println("Test #2: ");
        System.out.println(library.findBooksByAuthor("John Doe"));
        
        System.out.println("Test #3: ");
        System.out.println(library.findBooksPublishedAfter(1950));
        
        System.out.println("Test #4: ");
        System.out.println(library.findBooksPublishedAfter(1990));
        
        System.out.println("\nTest #5: ");
        System.out.println("Before invoking  the method: " + library.size());
        System.out.println(library.removeBookByISBN("978-0061120084"));
        System.out.println("After invoking the method:" + library.size());
        
        System.out.println("\nTest #6: ");
        System.out.println("Before invoking  the method: " + library.size());
        System.out.println(library.removeBookByISBN("isbn-isbn"));
        System.out.println("After invoking the method:" + library.size());

    }
}
