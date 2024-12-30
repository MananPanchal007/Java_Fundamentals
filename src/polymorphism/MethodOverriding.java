package polymorphism;
// This is a method overriding polymorphism

class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();

//        Rectangle rectangle = new Rectangle();
//        Here Rectangle - specify the class name
//        rectangle - reference variable
//        new - it's keyword used to create a new object
//        Rectangle() - This is the constructor call
    }
}
