public class Question5 {

    // Method with name only
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method with name and age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        displayInfo("David");
        displayInfo("David", 21);
    }
}