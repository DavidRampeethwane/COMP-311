import java.io.File; // Imports File
import java.io.FileNotFoundException; // Imports exception
import java.io.FileWriter; // Imports FileWriter
import java.io.IOException; // Imports IOException
import java.io.PrintWriter; // Imports PrintWriter
import java.util.Scanner; // Imports Scanner

public class Question6 {

    public static void main(String[] args) {

        try (Scanner reader =
                 new Scanner(new File("story.txt")); // Read source file
             PrintWriter writer =
                 new PrintWriter(new FileWriter("story_copy.txt"))) { // Create copy

            while (reader.hasNextLine()) {

                String line = reader.nextLine(); // Read line

                writer.println(line); // Write line
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("Source file not found.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }
    }
}