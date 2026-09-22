public class Question4 {

    // Overloaded method for integers
    public static int combine(int a, int b) {
        return a + b;
    }

    // Overloaded method for Strings
    public static String combine(String a, String b) {
        return a + b;
    }

    // Overloaded method for doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(combine(5, 3));
        System.out.println(combine("Java ", "Methods"));
        System.out.println(combine(4.5, 3.2));
    }
}
