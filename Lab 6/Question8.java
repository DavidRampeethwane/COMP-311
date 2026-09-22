class Animal {

    // Parent class method
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    // Overridden method
    @Override
    public void speak() {
        System.out.println("Cat says meow");
    }
}

public class Question8 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.speak();
        cat.speak();
    }
}