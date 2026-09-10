import java.io.File;                // allows reading from files
import java.io.FileNotFoundException; // handles missing file errors
import java.io.FileWriter;          // allows writing to files
import java.io.IOException;         // handles writing errors
import java.util.Scanner;           // allows reading line by line

public class Question9 {
    public static void main(String[] args) {
        try {
            // Create a File object pointing to "numbers.txt"
            File file = new File("numbers.txt");

            // Create a Scanner to read from the file
            Scanner reader = new Scanner(file);

            // Initialize counters and totals
            int positiveCount = 0;
            int negativeCount = 0;
            long positiveTotal = 0;
            long negativeTotal = 0;

            // Loop through each line in numbers.txt
            while (reader.hasNextLine()) {
                // Read one number per line and convert it to an integer
                int number = Integer.parseInt(reader.nextLine().trim());

                // Check if the number is positive or negative
                if (number > 0) {
                    positiveTotal += number;
                    positiveCount++;
                } else if (number < 0) {
                    negativeTotal += number;
                    negativeCount++;
                }
                // Zero values are ignored (neither positive nor negative)
            }

            // Close the reader
            reader.close();

            // Create a FileWriter to write results to "signs.txt"
            FileWriter writer = new FileWriter("signs.txt");

            // Write totals and counts to the file
            writer.write("Positive total: " + positiveTotal + "\n");
            writer.write("Positive count: " + positiveCount + "\n");
            writer.write("Negative total: " + negativeTotal + "\n");
            writer.write("Negative count: " + negativeCount + "\n");

            // Close the writer
            writer.close();

            // Confirmation message
            System.out.println("Positive and negative totals successfully written to signs.txt");

        } catch (FileNotFoundException e) {
            // Handles missing numbers.txt file
            System.out.println("Error: numbers.txt file not found.");
        } catch (IOException e) {
            // Handles writing errors
            System.out.println("Error: Unable to write to signs.txt.");
        }
    }
}
