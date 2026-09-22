class Parent {

    // Method 1
    public void show() {
        System.out.println("Parent show()");
    }

    // Overloaded method
    public void show(String message) {
        System.out.println("Parent says: " + message);
    }
}

class Child extends Parent {

    // Overridden method
    @Override
    public void show() {
        System.out.println("Child overrides show()");
    }
}

public class Question9 {

    public static void main(String[] args) {

        Child child = new Child();

        // Overridden version
        child.show();

        // Overloaded version
        child.show("Hello Java");
    }
}