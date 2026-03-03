class StaticDemo {

    // Static variable (shared by all objects)
    static int count = 0;

    // Instance variable
    String name;

    // Constructor
    StaticDemo(String name) {
        this.name = name;
        count++;   // Increment static variable
    }

    // Static method
    static void showCount() {
        System.out.println("Total objects created: " + count);
        // Cannot access non-static variable 'name' directly here
    }

    // Instance method
    void display() {
        System.out.println("Name: " + name);
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo("Girish");
        StaticDemo obj2 = new StaticDemo("Rahul");
        StaticDemo obj3 = new StaticDemo("Anita");

        obj1.display();
        obj2.display();
        obj3.display();

        // Calling static method using class name
        StaticDemo.showCount();
    }
}