import java.io.FileWriter; // Imports FileWriter
import java.io.IOException; // Imports IOException
import java.io.PrintWriter; // Imports PrintWriter

public class Question7 {

    public static void main(String[] args) {

        try (PrintWriter writer =
                     new PrintWriter(new FileWriter("output.txt", true))) {
            // true means append instead of overwrite

            writer.println("New appended line 1"); // Add line

            writer.println("New appended line 2"); // Add line

            System.out.println("Lines appended successfully.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }
    }
}