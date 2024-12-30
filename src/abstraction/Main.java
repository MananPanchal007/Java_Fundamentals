package abstraction;

// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();

    // Regular method
    public void color() {
        System.out.println("Coloring the shape.");
    }
}

// Subclass (inheriting from an abstract class)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        // We cannot create an object of an abstract class
        // Shape shape = new Shape(); // This would cause an error

        // We can create an object of the subclass
        Shape circle = new Circle();
        circle.draw();  // Output: Drawing a circle
        circle.color(); // Output: Coloring the shape
    }
}
