import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create a Scanner object to read input from the user
        int choice;                           //declare an integer variable to store the user's menu choice

        // do-while loop ensures the menu shows at least once
        do {
            System.out.println("Menu:");
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");//prompt the user to enter their choice
            
            choice = input.nextInt();          //read the user's choice and store it in the variable choice

            if (choice == 1) {                  //if the user chooses 1, print a message indicating they chose to continue
                System.out.println("You chose to continue...");
            } else if (choice != 2) {           //if the user enters a number other than 1 or 2, print an invalid choice message
                System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 2);                   // loop repeats until user enters 2

        System.out.println("Program exited.");//print a message indicating the program has exited
    }
}
