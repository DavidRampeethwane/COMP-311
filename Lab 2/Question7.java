import java.io.File;                // allows reading from files
import java.io.FileNotFoundException; // handles missing file errors
import java.io.FileWriter;          // allows writing to files
import java.io.IOException;         // handles writing errors
import java.util.Scanner;           // allows reading line by line

public class Question7 {
    public static void main(String[] args) {
        try {
            // Create a File object pointing to "numbers.txt"
            File file = new File("numbers.txt");

            // Create a Scanner to read from the file
            Scanner reader = new Scanner(file);

            // Initialize variables for calculations
            int smallest = Integer.MAX_VALUE; // start with the largest possible integer
            int largest = Integer.MIN_VALUE;  // start with the smallest possible integer
            long sum = 0;                     // use long to handle large totals
            int count = 0;                    // number of integers read

            // Loop through each line in numbers.txt
            while (reader.hasNextLine()) {
                // Read one number per line
                int number = Integer.parseInt(reader.nextLine().trim());

                // Update smallest and largest values
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }

                // Add to the running total and increment count
                sum += number;
                count++;
            }

            // Calculate the average (cast to double for decimal precision)
            double average = (double) sum / count;

            // Create a FileWriter to write results to "stats.txt"
            FileWriter writer = new FileWriter("stats.txt");

            // Write the results in a clear format
            writer.write("Smallest: " + smallest + "\n");
            writer.write("Largest: " + largest + "\n");
            writer.write("Average: " + average + "\n");

            // Close both reader and writer
            reader.close();
            writer.close();

            // Confirmation message
            System.out.println("Statistics successfully written to stats.txt");

        } catch (FileNotFoundException e) {
            // Handles missing numbers.txt file
            System.out.println("Error: numbers.txt file not found.");
        } catch (IOException e) {
            // Handles writing errors
            System.out.println("Error: Unable to write to stats.txt.");
        }
    }
}
