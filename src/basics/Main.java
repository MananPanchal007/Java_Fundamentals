package basics;

import java.util.Scanner; // Import Scanner class for user input

public class Main {

    // Basic.Main method - entry point of the program
    public static void main(String[] args) {

        // ---------------------------------------------
        // OUTPUT EXAMPLE
        // Uncomment to see the output
        // System.out.println("Jay Yogeshwar");
        // ---------------------------------------------

        // ---------------------------------------------
        // VARIABLES
        // Demonstrating different data types in Java
        int a = 10;                  // Integer
        long b = 1098765L;          // Long integer
        float price = 10.5f;        // Single precision floating-point
        double pi = 3.14;           // Double precision floating-point
        char ch = 'a';              // Character
        boolean isTrue = true;      // Boolean value
        String name = "Manan";      // String

        // Outputting the values of the variables
        System.out.println("Integer a: " + a);
        System.out.println("Double pi: " + pi);
        System.out.println("Float price: " + price);
        System.out.println("Character ch: " + ch);
        System.out.println("Boolean isTrue: " + isTrue);
        System.out.println("String name: " + name);
        // ---------------------------------------------

        // ---------------------------------------------
        // SUM OF A AND B
        int x = 10;
        int y = 5;
        int sum = x + y; // Calculating the sum
        System.out.println("Sum of x and y: " + sum);
        // ---------------------------------------------

        // ---------------------------------------------
        // USER INPUT
        // Getting user input for name
        Scanner sc = new Scanner(System.in); // Creating a Scanner object
        System.out.print("Enter your full name: ");
        String inputName = sc.nextLine(); // Reading input
        System.out.println("Your name is: " + inputName);

        // Getting user input for age
        System.out.print("Enter your age: ");
        int inputAge = sc.nextInt(); // Reading input
        System.out.println("Your age is: " + inputAge);
        // ---------------------------------------------

        // ---------------------------------------------
        // SUM OF USER INPUT NUMBERS
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        int userSum = firstNumber + secondNumber; // Calculating the sum
        System.out.println("Sum of first and second numbers: " + userSum);
        // ---------------------------------------------

        // ---------------------------------------------
        // ARITHMETIC OPERATORS
        int num1 = 10;
        int num2 = 3;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        num1++; // Incrementing num1
        System.out.println("Incremented num1: " + num1);
        num2--; // Decrementing num2
        System.out.println("Decremented num2: " + num2);
        // ---------------------------------------------

        // ---------------------------------------------
        // LOGICAL OPERATORS
        System.out.println("Logical AND (3 > 2 && 2 < 1): " + ((3 > 2) && (2 < 1)));
        System.out.println("Logical OR (3 > 2 || 2 < 1): " + ((3 > 2) || (2 < 1)));
        System.out.println("Logical NOT (!(2 < 1)): " + !(2 < 1));
        // ---------------------------------------------

        // ---------------------------------------------
        // CONDITIONAL OPERATOR
        int a1 = 10;
        int b1 = 20;
        int max = (a1 > b1) ? a1 : b1; // Finding the maximum using the conditional operator
        System.out.println("The maximum value is: " + max);
        // ---------------------------------------------

        // ---------------------------------------------
        // ELSE IF STATEMENTS
        int age = 17;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }
        // ---------------------------------------------

        // ---------------------------------------------
        // SWITCH STATEMENT
        int switchNumber = 2;
        switch (switchNumber) {
            case 1:
                System.out.println("Alpha");
                break;
            case 2:
                System.out.println("Beta");
                break;
            case 3:
                System.out.println("Gamma");
                break;
            default:
                System.out.println("Nothing");
        }
        // ---------------------------------------------

        // ---------------------------------------------
        // LOOPS
        // While loop example
        int count = 0;
        while (count < 5) {
            System.out.println("Hello");
            count++; // Incrementing count
        }

        // Printing numbers from 1 to 10 using while loop
        int num = 1;
        while (num < 11) {
            System.out.println(num);
            num++; // Incrementing num
        }

        // For loop example
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // Break statement example
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println(i);
        }

        // Continue statement example
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop iteration when i is 3
            }
            System.out.println(i);
        }
        // ---------------------------------------------

        // ---------------------------------------------
        // STRING EXAMPLES
        String str1 = "Hello, World!";
        System.out.println("str1: " + str1);

        // Example of String created with the new keyword
        String str2 = new String("Hello, Java!");
        System.out.println("str2: " + str2);

        // Using some String methods
        int length = str1.length(); // Length of the string
        char charAt = str1.charAt(0); // Character at index 0
        String substring = str1.substring(7); // Substring from index 7
        String replacedString = str1.replace("World", "Java"); // Replacing a substring
        String upperCaseString = str1.toUpperCase(); // Converting to uppercase

        System.out.println("Length of str1: " + length);
        System.out.println("Character at index 0 in str1: " + charAt);
        System.out.println("Substring from index 7 in str1: " + substring);
        System.out.println("Replaced 'World' with 'Java' in str1: " + replacedString);
        System.out.println("str1 in uppercase: " + upperCaseString);
        // ---------------------------------------------

        // ---------------------------------------------
        // StringBuffer Example - It is used when you need thread safety in program
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", World!"); // Appending a string
        stringBuffer.insert(5, " Java"); // Inserting a string
        stringBuffer.replace(6, 10, "C++"); // Replacing a part of the string
        stringBuffer.delete(6, 10); // Deleting part of the string
        String stringBufferResult = stringBuffer.toString(); // Converting to String

        System.out.println("StringBuffer result: " + stringBufferResult);

        // Example of StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!"); // Appending a string
        stringBuilder.insert(5, " Java"); // Inserting a string
        stringBuilder.replace(6, 10, "C++"); // Replacing a part of the string
        stringBuilder.delete(6, 10); // Deleting part of the string
        String stringBuilderResult = stringBuilder.toString(); // Converting to String

        System.out.println("StringBuilder result: " + stringBuilderResult);
        // ---------------------------------------------

        // ---------------------------------------------
        // RETURN STATEMENT
        System.out.println("Result from findNumber(): " + findNumber());
        // ---------------------------------------------

    }

    // Method to demonstrate the return statement
    public static int findNumber() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) { // Check if the number is 3
                return i; // Exit the method and return 3
            }
            System.out.println("Checking number: " + i);
        }
        return -1; // Return -1 if the number 3 is not found (impossible in this example)
    }

}