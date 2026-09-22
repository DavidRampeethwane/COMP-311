public class Question3 {

    // Void method prints the banner directly
    public static void printBanner() {
        System.out.println("******** WELCOME ********");
    }

    // Method returns the banner as a String
    public static String getBanner() {
        return "******** WELCOME ********";
    }

    public static void main(String[] args) {

        // Calling void method
        printBanner();

        // Printing returned String
        System.out.println(getBanner());
    }
}