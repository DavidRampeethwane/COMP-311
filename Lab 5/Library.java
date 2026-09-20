import java.util.ArrayList;

// Library class stores and manages books
public class Library {

    // ArrayList to store Book objects
    private ArrayList<Book> books;

    // Constructor initializes the ArrayList
    public Library() {
        books = new ArrayList<>();
    }

    // Adds a book to the library
    public void addBook(Book b) {
        books.add(b);
    }

    // Displays all books in the library
    public void printAllBooks() {

        // Loop through each book and print its summary
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }
}