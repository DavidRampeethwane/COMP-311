import java.util.Scanner;                             //import the Scanner class to read input from the user

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       //create a Scanner object to read input from the user

        // Ask the user for a whole number
        System.out.print("Enter a whole number: ");
        int num = input.nextInt();                   //read the user's input and store it in the variable num

        long factorial = 1;                         // use long to handle larger results

        
        for (int i = 1; i <= num; i++) {            // loop from 1 to the number entered by the user to calculate the factorial
            factorial = factorial * i;              // multiply the current value of factorial by i to get the new factorial value
        }

        
        System.out.println("The factorial of " + num + " is " + factorial);//print the result of the factorial calculation
    }
}
