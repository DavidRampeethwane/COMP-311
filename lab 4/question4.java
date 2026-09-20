import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user for a decimal number
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        // Convert decimal number to binary
        String binary = Integer.toBinaryString(number);

        // Display binary result
        System.out.println("Binary representation: " + binary);

        // Close scanner
        input.close();
    }
}