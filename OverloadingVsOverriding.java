// Demonstrating Method Overloading
class Calculator {

    // Overloaded methods (same name, different parameters)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Demonstrating Method Overriding
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverloadingVsOverriding {

    public static void main(String[] args) {

        // Method Overloading demo
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));

        // Method Overriding demo
        Animal a = new Dog();   // parent reference, child object
        a.sound();              // runtime polymorphism
    }
}