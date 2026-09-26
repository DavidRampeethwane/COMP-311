import java.io.File; // Imports File
import java.io.FileNotFoundException; // Imports exception
import java.util.Scanner; // Imports Scanner

public class Question3 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(new File("missing.txt"))) { // Attempt to open file

            while (reader.hasNextLine()) {

                System.out.println(reader.nextLine());
            }

        } catch (FileNotFoundException e) {

            System.out.println("Sorry, missing.txt does not exist.");
        }
    }
}