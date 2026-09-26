import java.io.FileWriter; // Imports FileWriter
import java.io.IOException; // Imports IOException
import java.io.PrintWriter; // Imports PrintWriter

public class Question2 {

    public static void main(String[] args) {

        try {

                try (PrintWriter writer =
                    new PrintWriter(new FileWriter("output.txt"))) { // Create file

                writer.println("Line 1"); // Write line
                writer.println("Line 2"); // Write line
                writer.println("Line 3"); // Write line
                writer.println("Line 4"); // Write line
                writer.println("Line 5"); // Write line
                } // Close file automatically

            System.out.println("File written successfully.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }
    }
}