// Demonstrates the use of the Library class
public class Question10 {

    public static void main(String[] args) {

        // Create a Library object
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Java Programming", "John Smith", 250.50));
        library.addBook(new Book("Database Systems", "Jane Brown", 300.75));
        library.addBook(new Book("Computer Networks", "Peter Jones", 280.00));
        library.addBook(new Book("Web Development", "Mary White", 220.00));

        // Display all books in the library
        library.printAllBooks();
    }
}