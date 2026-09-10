import java.util.Scanner;  // telling java to include scanner from the utill parkage

public class Question1 {
    public static void main(String[] args) {
        //i Created a Scanner object called console to capture inputs from the keyboard(system.in)
        try (Scanner console = new Scanner(System.in)) {

        // Prompt the user to enter a score between 0 and 100
        System.out.print("Enter your score (0–100): ");
        int score = console.nextInt(); //reads a number and store it in a variable(score)

        // determining the letter grade for the score that was entered by the user
        if (score >= 80 && score <= 100) {
            System.out.println("Grade: A"); //if the score he entered was between  80 and 100 then the grade is A
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: B");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: C");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade: D");
        } else if (score < 50 && score >= 0) {
            System.out.println("Grade: F");
        } else {
            // the message that will be printed out if the input is outside the given range
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        }

        }
    }
}
