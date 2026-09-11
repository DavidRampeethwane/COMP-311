import java.util.Scanner;                        //import the Scanner class to read input from the user

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //create a Scanner object to read input from the user

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();                //read the user's input and store it in the variable num

        
        for (int i = 1; i <= 12; i++) {            // loop from 1 to 12 to generate the multiplication table
            System.out.println(num + " x " + i + " = " + (num * i));//print the multiplication result for each iteration
        }
    }
}
