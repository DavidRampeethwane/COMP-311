import java.io.File; // Imports File
import java.io.FileNotFoundException; // Imports exception
import java.util.Scanner; // Imports Scanner

public class Question5 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(new File("story.txt"))) { // Open file

            int words = 0; // Stores total words

            while (reader.hasNextLine()) {

                String line = reader.nextLine(); // Read line

                String[] data = line.split(" "); // Split into words

                words += data.length; // Add number of words
            }

            System.out.println("Total words: " + words);

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}