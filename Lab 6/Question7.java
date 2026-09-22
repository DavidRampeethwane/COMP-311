public class Question7 {

    // Attempts to double the parameter
    public static void tryToDouble(int number) {

        // Only changes local copy
        number = number * 2;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int value = 10;

        System.out.println("Before method: " + value);

        tryToDouble(value);

        // Original variable remains unchanged
        System.out.println("After method: " + value);
    }
}