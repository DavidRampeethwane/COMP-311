import java.io.File;                // allows reading from files
import java.io.FileNotFoundException; // handles missing file errors
import java.io.FileWriter;          // allows writing to files
import java.io.IOException;         // handles writing errors
import java.util.Scanner;           // allows reading line by line

public class Question5 {
    public static void main(String[] args) {
        try {
            // Create a File object pointing to "students.txt"
            File file = new File("students.txt");

            // Create a Scanner to read from the file
            Scanner reader = new Scanner(file);

            // Create a FileWriter to write to a new file "grades.txt"
            FileWriter writer = new FileWriter("grades.txt");

            // Loop through each line in students.txt
            while (reader.hasNextLine()) {
                // Read one line of text (e.g., "Thabo Kgomo,78")
                String line = reader.nextLine();

                // Split the line into name and score using the comma
                String[] parts = line.split(",");
                String name = parts[0].trim(); // student's name
                int score = Integer.parseInt(parts[1].trim()); // convert score to integer

                // Determine the letter grade based on score
                String grade;
                if (score >= 80) {
                    grade = "A";
                } else if (score >= 70) {
                    grade = "B";
                } else if (score >= 60) {
                    grade = "C";
                } else if (score >= 50) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                // Write the result to grades.txt in the format Name,Score,Grade
                writer.write(name + "," + score + "," + grade + "\n");
            }

            // Close both the reader and writer
            reader.close();
            writer.close();

            // Confirmation message
            System.out.println("Grade report successfully written to grades.txt");

        } catch (FileNotFoundException e) {
            // Handles missing students.txt file
            System.out.println("Error: students.txt file not found.");
        } catch (IOException e) {
            // Handles writing errors
            System.out.println("Error: Unable to write to grades.txt.");
        }
    }
}
