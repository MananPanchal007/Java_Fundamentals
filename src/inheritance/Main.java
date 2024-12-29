package inheritance;

// Superclass (Parent class)
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog{
    public void bark(){
        System.out.println("The cat barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();

        // Calling methods from the subclass and superclass
        dog.eat();  // Method inherited from Animal class
        dog.bark(); // Method from Dog class

        // Calling methods from the subclass and superclass
        Cat cat = new Cat();
        cat.bark(); // Method from Cat class
        cat.eat();  // Method inherited from Animal class
    }
}
