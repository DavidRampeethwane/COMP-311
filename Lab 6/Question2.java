public class Question2 {

    // Method calculates and returns circle area
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Test the method with different radii
        System.out.println("Area (r = 5): " + circleArea(5));
        System.out.println("Area (r = 10): " + circleArea(10));
    }
}