// Demonstrates the use of arrays with objects
public class Question6 {

    public static void main(String[] args) {

        // Create an array that can store 3 Book objects
        Book[] books = new Book[3];

        // Store Book objects in the array
        books[0] = new Book("Java Programming", "John Smith", 250.50);
        books[1] = new Book("Database Systems", "Jane Brown", 300.75);
        books[2] = new Book("Computer Networks", "Peter Jones", 280.00);

        // Loop through the array and display each book summary
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }
}