import java.io.File;                // allows reading from files
import java.io.FileNotFoundException; // handles missing file errors
import java.util.Scanner;           // allows reading line by line

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner for user input

        // Ask the user to enter a number to search for
        System.out.print("Enter a number to search for: ");
        int target = input.nextInt();

        boolean found = false; // flag to track if number is found

        try {
            // Create a File object pointing to "numbers.txt"
            File file = new File("numbers.txt");

            // Create a Scanner to read from the file
            Scanner reader = new Scanner(file);

            // Loop through each line in numbers.txt
            while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine().trim());

                // Check if the current number matches the target
                if (number == target) {
                    found = true;
                    break; // stop searching once found
                }
            }

            // Close the reader
            reader.close();

            // Print the result to the console
            System.out.println(found);

        } catch (FileNotFoundException e) {
            // Handles missing numbers.txt file
            System.out.println("Error: numbers.txt file not found.");
        }

        // Close the user input Scanner
        input.close();
    }
}
