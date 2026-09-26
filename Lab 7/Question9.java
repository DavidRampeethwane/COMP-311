import java.io.FileWriter; // Imports FileWriter
import java.io.IOException; // Imports IOException
import java.io.PrintWriter; // Imports PrintWriter
import java.util.Scanner; // Imports Scanner

public class Question9 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) { // Keyboard input

            try (PrintWriter writer =
                         new PrintWriter(new FileWriter("results.txt"))) {

                for (int i = 1; i <= 3; i++) { // Loop 3 times

                    System.out.print("Enter student name: ");
                    String name = input.nextLine(); // Read name

                    System.out.print("Enter score: ");
                    int score = input.nextInt(); // Read score

                    input.nextLine(); // Clear newline

                    writer.println(name + "," + score); // Save record
                }
            }

            System.out.println("Results saved.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }

    }
}