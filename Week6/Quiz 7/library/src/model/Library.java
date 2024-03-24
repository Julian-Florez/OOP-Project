/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * 
 */
public class Library {
	
    private ArrayList<Book> books;

    /**
	 * Create an instance of Class Library 
	 */
	public Library() {
		this.books = new ArrayList<>();
	}

	/**
	 * Get the number of books of library
	 * @return an integer that represents the size of library measured in quantity of books
	 */
    public int size() {
        return books.size();
    }
    
	/**
	 * Add a book to the library
	 * @param book, an object that represents a book
	 */
    public void addBook(Book book) {
        books.add(book);
    }
    
    
    /**
     * Returns the value given to it in string format
     */
    public String toString() {
        /**
         * There is an error in this toString method, it is not returning the correct information 
         */
    	String info_books = "";
    	String line_break = "\n";
    	
        if (books.isEmpty()) {
        	info_books = "The library is empty";
        } 
        else {
        	info_books += "Books in the library:" + line_break;
            for (int i = 0; i < books.size(); i++) {
            	//info_books = books.get(i).toString() + line_break;    original code, it it replacing the value of info_books instead of concatenating as a result it only gives the last book in the library             
            	info_books += books.get(i).toString() + line_break;     //corrected code, it concatenates the value of info_books with the value of the book in the library            
            }
        }        
        return info_books;
    }
    
    
    /***************************************************************************************
     * 
     * 								IMPLEMENT THE FOLLOWING METHODS
     * 
     **************************************************************************************/    
    
    
    /**
     * Method to find books by a given author
     * @param author, a String value that identifies the name of the person who wrote books 
     * @return An ArraList that contains the books written by author
     */
    public ArrayList<Book> findBooksByAuthor(String author) {
    	ArrayList<Book> foundBooks = new ArrayList<Book>();
        for(Book book : books) {
            if(book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }


    /**
     * Method to find books published after a given year
     * @param year, an integer value that represents the year when it was officially published.
     * @return  An ArraList that contains the books written after year given
     */
    public ArrayList<Book> findBooksPublishedAfter(int year) {
    	ArrayList<Book> foundBooks = new ArrayList<Book>();
        for(Book book : books) {
            if(book.getYear() >= year) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    
    /**
     * Method to remove a book from the library by ISBN
     * @param isbn, a 13-digit number that uniquely identifies books published internationally
     * @return true, if the book was found and deleted; false, on the contrary case.
     */
    public boolean removeBookByISBN(String isbn) {
    	for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
