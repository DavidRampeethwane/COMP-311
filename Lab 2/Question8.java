import java.io.File;                // allows reading from files
import java.io.FileNotFoundException; // handles missing file errors
import java.io.FileWriter;          // allows writing to files
import java.io.IOException;         // handles writing errors
import java.util.Scanner;           // allows reading line by line

public class Question8 {
    public static void main(String[] args) {
        try {
            // Create a File object pointing to "numbers.txt"
            File file = new File("numbers.txt");

            // Create a Scanner to read from the file
            Scanner reader = new Scanner(file);

            // Initialize counters for even and odd numbers
            int evenCount = 0;
            int oddCount = 0;

            // Loop through each line in numbers.txt
            while (reader.hasNextLine()) {
                // Read one number per line and convert it to an integer
                int number = Integer.parseInt(reader.nextLine().trim());

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Close the reader after reading all numbers
            reader.close();

            // Create a FileWriter to write results to "evenodd.txt"
            FileWriter writer = new FileWriter("evenodd.txt");

            // Write both counts to the file
            writer.write("Even numbers: " + evenCount + "\n");
            writer.write("Odd numbers: " + oddCount + "\n");

            // Close the writer
            writer.close();

            // Confirmation message
            System.out.println("Even and odd counts successfully written to evenodd.txt");

        } catch (FileNotFoundException e) {
            // Handles missing numbers.txt file
            System.out.println("Error: numbers.txt file not found.");
        } catch (IOException e) {
            // Handles writing errors
            System.out.println("Error: Unable to write to evenodd.txt.");
        }
    }
}
