package LambdaExpression;

// Step 1: Define a functional interface (an interface with only one abstract method)
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b); // Abstract method
}

public class LambdaExample {
    public static void main(String[] args) {
        // Step 2: Implementing the interface using Lambda expressions

        // Addition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(10, 5));

        // Subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(10, 5));

        // Multiplication
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(10, 5));

        // Division
        MathOperation division = (a, b) -> a / b;
        System.out.println("Division: " + division.operate(10, 5));
    }
}

