import java.io.FileWriter;
import java.io.IOException;

class Question2 {
    public static void main(String[] args) {

        // Array containing sample double values
        double[] numbers = {12.5, 25.8, 33.1, 45.6, 50.0};

        try {
            // Create file writer object
            FileWriter writer = new FileWriter("output.txt");

            // Write each array element to the file
            for (int i = 0; i < numbers.length; i++) {
                writer.write(numbers[i] + "\n");
            }

            // Close the file
            writer.close();

            System.out.println("Array values written to output.txt");

        } catch (IOException e) {
            // Runs if an error occurs while writing
            System.out.println("Error writing to file.");
        }
    }
}