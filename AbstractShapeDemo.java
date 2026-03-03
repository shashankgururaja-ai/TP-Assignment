abstract class Shape {

    // Abstract method
    abstract double area();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area() method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area() method
    double area() {
        return length * width;
    }
}

// Main class
public class AbstractShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}