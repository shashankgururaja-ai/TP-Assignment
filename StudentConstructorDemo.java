class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentConstructorDemo {

    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student("Ravi", 20);

        // Display details
        System.out.println("Student created using Default Constructor:");
        s1.display();

        System.out.println("\nStudent created using Parameterized Constructor:");
        s2.display();
    }
}