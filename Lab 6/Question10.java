import java.util.Scanner;

public class Question10 {

    // Calculates area
    public static double area(double length, double width) {
        return length * width;
    }

    // Calculates perimeter
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Read length
            System.out.print("Enter length: ");
            double length = input.nextDouble();

            // Read width
            System.out.print("Enter width: ");
            double width = input.nextDouble();

            // Display results
            System.out.println("Area = " + area(length, width));
            System.out.println("Perimeter = " + perimeter(length, width));
        }
    }
}