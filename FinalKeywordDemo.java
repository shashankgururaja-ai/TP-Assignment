// Final class (cannot be inherited)
final class FinalClass {

    void display() {
        System.out.println("This is a final class.");
    }
}

// Parent class
class Parent {

    // Final variable (constant)
    final int value = 100;

    // Final method (cannot be overridden)
    final void show() {
        System.out.println("This is a final method.");
    }
}

// Child class
class Child extends Parent {

    // Uncommenting below will cause error (cannot override final method)
    /*
    void show() {
        System.out.println("Overriding not allowed");
    }
    */

    void displayValue() {
        // value = 200;  // Error: cannot change final variable
        System.out.println("Final variable value: " + value);
    }
}

// Main class
public class FinalKeywordDemo {

    public static void main(String[] args) {

        // Final variable
        final int number = 50;
        System.out.println("Final local variable: " + number);

        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.displayValue();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}