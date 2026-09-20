import java.io.FileWriter;
import java.io.IOException;

class Question3 {
    public static void main(String[] args) {

        // Array of integers
        int[] numbers = {12, 7, 25, 3, 18, 40};

        // Variables for calculations
        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];

        // Process all numbers in the array
        for (int i = 0; i < numbers.length; i++) {

            // Add current number to sum
            sum += numbers[i];

            // Check for smallest value
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            // Check for largest value
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        try {
            // Create results file
            FileWriter writer = new FileWriter("results.txt");

            // Write calculated values to file
            writer.write("Sum: " + sum + "\n");
            writer.write("Smallest: " + smallest + "\n");
            writer.write("Largest: " + largest + "\n");

            // Close the file
            writer.close();

            System.out.println("Results written to results.txt");

        } catch (IOException e) {
            // Handles file-writing errors
            System.out.println("Error writing file.");
        }
    }
}