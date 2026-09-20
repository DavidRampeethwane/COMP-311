// Book class represents a book object
public class Book {

    // Instance variables to store book details
    private String title;
    private String author;
    private double price;

    // Constructor used to initialize a Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    // Updates the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Returns the author of the book
    public String getAuthor() {
        return author;
    }

    // Updates the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // Returns the price of the book
    public double getPrice() {
        return price;
    }

    // Updates the price of the book
    public void setPrice(double price) {
        this.price = price;
    }

    // Returns a summary of the book details
    public String getSummary() {
        return "Title: " + title +
               ", Author: " + author +
               ", Price: P" + price;
    }
}