class Animal {

    // Method in base class
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class inheriting Animal
class Dog extends Animal {

    // Method in derived class
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        // Creating object of derived class
        Dog d = new Dog();

        // Calling base class method
        d.eat();

        // Calling derived class method
        d.bark();
    }
}