package encapsulation;

class Employee {
    // Private variables - Encapsulation
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        }
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Simple validation
            this.salary = salary;
        }
    }

    // Public getter method for salary
    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Manan", 22, 100000);

        // Accessing private variables through public methods
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        // Modifying private variables through public methods
        emp.setName("Dixa");
        emp.setAge(16);
        emp.setSalary(1000000);

        // Displaying updated information
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Age: " + emp.getAge());
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
