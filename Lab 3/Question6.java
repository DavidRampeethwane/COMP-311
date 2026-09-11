import java.util.Scanner;                       //import the Scanner class to read input from the user

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create a Scanner object to read input from the user
        int number;                            //declare an integer variable to store the user's input
        int total = 0;                         //declare an integer variable to store the running total  

        // do-while loop ensures the prompt runs at least once
        do {
            System.out.print("Enter a number : ");// prompt the user for input
            number = input.nextInt();            // read the user's input and store it in the variable number

            total = total + number;              // add to running total

        } while (number != 0);                   // loop continues until user enters 0

        System.out.println("Final total is: " + total);
    }
}
