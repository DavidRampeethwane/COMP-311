import java.io.File; // Imports File class
import java.io.FileWriter; // Imports FileWriter
import java.io.IOException; // Imports IOException
import java.io.PrintWriter; // Imports PrintWriter
import java.util.Scanner; // Imports Scanner

public class Question10 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(new File("results.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("passed.txt"))) {

            while (reader.hasNextLine()) {

                String line = reader.nextLine(); // Read line

                String[] data = line.split(","); // Split at comma

                String name = data[0]; // Get name

                int score = Integer.parseInt(data[1]); // Convert score

                if (score >= 50) { // Check pass mark

                    writer.println(name + "," + score); // Write passing student
                }
            }

            System.out.println("Passed students saved.");

        } catch (IOException e) {

            System.out.println("Error processing file.");
        }
    }
}