import java.io.File; // Imports File
import java.io.FileNotFoundException; // Imports exception
import java.util.Scanner; // Imports Scanner

public class Question4 {

    public static void main(String[] args) {

        try {

            Scanner reader =
                    new Scanner(new File("story.txt")); // Read story file

            int count = 0; // Stores number of lines

            while (reader.hasNextLine()) {

                reader.nextLine(); // Read line

                count++; // Increase counter
            }

            reader.close(); // Close file

            System.out.println("Number of lines: " + count);

        } catch (FileNotFoundException e) {

            System.out.println("File not 