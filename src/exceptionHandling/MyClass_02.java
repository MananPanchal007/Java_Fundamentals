package exceptionHandling;

public class MyClass_02 {

    public static void main(String[] args) {
        System.out.println(m1());
//        System.out.println(m2());
    }

//    this code is written for example of "finally" and "throw" in exception handling

    public static int m1() {
        try {
            System.out.println("try method");
            System.out.println(10 / 0);
            return 10;
        } catch (ArithmeticException e) {
            return 100;
        } finally {
            return 1000;
        }
    }

//    the following code shows the usage of "throw"

    public static int m2() {
        try {
            System.out.println(10 / 0);
            throw new ArithmeticException("Main reason nahi dunga, karle jo karna he");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        return 0;
    }
}


