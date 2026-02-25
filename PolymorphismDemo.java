class Shape {

    // Method to be overridden
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

// Derived class Circle
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Base class reference, different objects
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        // Runtime polymorphism
        s1.draw();
        s2.draw();
    }
}