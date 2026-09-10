import java.util.Scanner;  // telling java to include scanner from the util package.

public class Question2 {
    public static void main(String[] args) {
        //i Created a Scanner object called console to capture inputs from the keyboard(system.in).
        Scanner console = new Scanner(System.in);

        //prompt to ask the user to enter their full name.
        System.out.print("Enter your full name: ");
        String fullName = console.nextLine(); //reads the full name entered by the user and stores it in a variable called fullName.

        // this line calculate the total number of characters including spaces and store it in a variable called length.
        int length = fullName.length();

        // this line converts the user name to uppercase
        String upper = fullName.toUpperCase();
        String lower = fullName.toLowerCase(); //this line converts the user name to lowercase

        //this line ask the user for a letter
        System.out.print("Enter a letter to check if your name starts with it: ");
        String letter = console.nextLine();//reads the letter entered by the user and stores it

        // this line checks whether the name starts with the given letter (case-insensitive)
        boolean startsWithLetter = fullName.toLowerCase().startsWith(letter.toLowerCase());

        // Displays all results
        System.out.println("Total characters (including spaces): " + length);
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);
        System.out.println("Starts with '" + letter + "': " + startsWithLetter);

        // Close the Scanner
        console.close();
    }
}
