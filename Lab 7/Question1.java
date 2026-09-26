import java.io.File; // Imports File class
import java.io.FileNotFoundException; // Imports exception class
import java.util.Scanner; // Imports Scanner

public class Question1 { // Class name

    public static void main(String[] args) { // Main method

        try { // Start try block

            File file = new File("story.txt"); // Open story.txt

            try (Scanner reader = new Scanner(file)) { // Scanner reads file

                while (reader.hasNextLine()) { // Loop through all lines

                    String line = reader.nextLine(); // Read line

                    System.out.println(line); // Print line
                }
            }

        } catch (FileNotFoundException e) { // Catch error

            System.out.println("File not found."); // Error message
        }
    }
}