import java.util.Scanner; // allows user input from the keyboard

public class Question6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 7
        System.out.print("Enter a number (1–7) representing a day of the week: ");
        int dayNumber = input.nextInt();

        // Use a switch statement to determine the day name
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // This message appears if the number is not between 1 and 7
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Close the Scanner to free system resources
        input.close();
    }
}
