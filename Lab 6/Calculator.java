public class Calculator {

    // Instance variable keeps track of multiply calls
    private int callCount = 0;

    // Static method can be called without an object
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    public int multiply(int a, int b) {

        // Increment counter each time method is called
        callCount++;
        return a * b;
    }
}

       