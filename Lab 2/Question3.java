import java.io.File;                //this will allow me to working with files
import java.io.FileNotFoundException; //this line Handles a situation where the file is missing
import java.util.Scanner;           // telling java to include scanner from the util package

public class Question3 {
    public static void main(String[] args) {
        try {
            //this line creates a File object that points to "students.txt"
            File file = new File("students.txt");

            // this line creates a Scanner object called reader to read from the file
            Scanner reader = new Scanner(file);

            //a Loop that reads the file line by line until there are no more lines
            while (reader.hasNextLine()) {
                // Read one line of text from the file and store it in a variable called line
                String line = reader.nextLine();

                // Split the line into parts using the comma
                String[] parts = line.split(",");

                //this line Stores the first part[0] as the student's name
                String name = parts[0];

                //this line Stores the second part[1] as the student's score
                String score = parts[1];

                //this line prints the student's name and score to the console, separated by a comma
                System.out.println("Name: " + name + ", Score: " + score);
            }

            // Close the Scanner
            reader.close();

        } catch (FileNotFoundException e) {
            // This message appears if the file "students.txt" cannot be found
            System.out.println("Error: students.txt file not found.");
        }
    }
}


