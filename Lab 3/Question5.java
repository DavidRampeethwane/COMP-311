import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                   //create a Scanner object to read input from the user
        int number;                                               //declare an integer variable to store the user's input

        // do-while loop ensures the prompt runs at least once
        do {
            System.out.print("Enter a number between 1 and 10: ");//prompt the user to enter a number
            number = input.nextInt();                             //read the user's input and store it in the variable number

            if (number < 1 || number > 10) {                       //check if the input is outside the valid range
                System.out.println("Invalid input. Please try again.");//print an error message if the input is invalid
            }

        } while (number < 1 || number > 10);                         // loop repeats until the user enters a valid number

        System.out.println("You entered a valid number: " + number);
    }
}
