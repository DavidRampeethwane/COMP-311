// Student class represents a student object
public class Student {

    // Instance variables
    private String name;
    private int age;
    private double gpa;

    // Constructor initializes student details
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Returns the student's name
    public String getName() {
        return name;
    }

    // Returns the student's age
    public int getAge() {
        return age;
    }

    // Returns the student's GPA
    public double getGpa() {
        return gpa;
    }
}
