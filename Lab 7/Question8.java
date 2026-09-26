import java.io.File; // Imports File
import java.io.FileNotFoundException; // Imports exception
import java.util.Scanner; // Imports Scanner

public class Question8 {

    public static void main(String[] args) {

        try {

            try (Scanner reader =
                    new Scanner(new File("numbers.txt"))) { // Read numbers file

                int sum = 0; // Stores total

                while (reader.hasNextInt()) {

                    int number = reader.nextInt(); // Read number

                    sum += number; // Add to sum
                }

                System.out.println("Total = " + sum);
            }

        } catch (FileNotFoundException e) {

            System.out.println("numbers.txt not found.");
        }
    }
}