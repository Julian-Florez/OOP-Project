/**
 * 
 */
package model;

/**
 * 
 */
public class Book {


    private String title;
    private String author;
    private int year;
    private int pages;
    private String isbn;
    private String publisher;

    /**
     * Create an instance of book with the parameter given.
     * @param title
     * @param author
     * @param year
     * @param pages
     * @param isbn
     * @param publisher
     */
    public Book(String title, String author, int year, int pages, String isbn, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    
    /** Getters and setters for all attributes*/
    
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	} 

    /**
     * Returns the value given to it in string format
     */
    public String toString() {
    	
    	String info_book = "";
    	String line_tap = "\n\t";

        info_book += line_tap + "Title: " + getTitle();
        info_book += line_tap + "Author: " + getAuthor();
        info_book += line_tap + "Year: " + getYear();
        info_book += line_tap + "Pages: " + getPages();
        info_book += line_tap + "ISBN: " + getIsbn();
        info_book += line_tap + "Publisher: " + getPublisher();
        info_book += line_tap;             
        
        return info_book;
    }

}//END CLASS
