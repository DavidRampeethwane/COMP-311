// Demonstrates creating and displaying Book objects
public class Question3 {

    public static void main(String[] args) {

        // Create first book object
        Book book1 = new Book("Java Programming", "John Smith", 250.50);

        // Create second book object
        Book book2 = new Book("Database Systems", "Jane Brown", 300.75);

        // Display details of first book
        System.out.println("Book 1");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: P" + book1.getPrice());

        System.out.println();

        // Display details of second book
        System.out.println("Book 2");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: P" + book2.getPrice());
    }
}
