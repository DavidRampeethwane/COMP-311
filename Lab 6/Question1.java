public class Question1 {

    // Method returns true if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        // Call method with different numbers
        System.out.println("4 is even: " + isEven(4));
        System.out.println("7 is even: " + isEven(7));
        System.out.println("10 is even: " + isEven(10));
    }
}