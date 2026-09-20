import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        // Array to store up to 20 words
        String[] names = new String[20];

        // Keeps track of how many words have been read
        int count = 0;

        try {
            // Open the file for reading
            Scanner fileScanner = new Scanner(new File("names.txt"));

            // Read words until end of file or array is full
            while (fileScanner.hasNext() && count < names.length) {
                names[count] = fileScanner.next();
                count++;
            }

            // Close the file
            fileScanner.close();

            // Display all words stored in the array
            System.out.println("Words read from file:");
            for (int i = 0; i < count; i++) {
                System.out.println(names[i]);
            }

        } catch (FileNotFoundException e) {
            // Runs if the file cannot be found
            System.out.println("File not found.");
        }
    }
}