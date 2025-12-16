package polymorphism;

// This is a `METHOD OVERLOADING` polymorphism

class Features {
    // Method to add three integers
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Overloaded method to add two doubles
    static void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        // Calling the method with three integer arguments
        Features.add(5, 6, 6);  // Output: 17

        // Calling the overloaded method with two double arguments
        Features.add(5.5, 6.3);  // Output: 11.8
    }
}
