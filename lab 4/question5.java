import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {

            // Get a word or phrase from the user
            System.out.print("Enter a word or phrase: ");
            String text = input.nextLine();

            // Remove spaces and convert to lowercase
            text = text.replaceAll("\\s+", "").toLowerCase();

            // Variable to store reversed text
            String reversed = "";

            // Reverse the string character by character
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }

            // Compare original and reversed strings
            if (text.equals(reversed)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
        }
    }
}