import java.io.FileWriter;      // allows writing to files
import java.io.IOException;     // handles errors when writing
import java.util.Scanner;       // allows user input

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Create a FileWriter object to write to "results.txt"
            FileWriter writer = new FileWriter("results.txt");

            // Loop to collect 5 students' names and scores
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter student " + i + " name: ");
                String name = input.nextLine();

                System.out.print("Enter student " + i + " score: ");
                String score = input.nextLine();

                // Write each record in the format Name,Score
                writer.write(name + "," + score + "\n");
            }

            // Close the writer
            writer.close();
            System.out.println("Data successfully written to results.txt");

        } catch (IOException e) {
            System.out.println("Error: Unable to write to results.txt");
        }

        input.close();
    }
}
