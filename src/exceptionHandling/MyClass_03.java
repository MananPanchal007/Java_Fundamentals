package exceptionHandling;

//  In this code every method throws error on the parent method,
//  so at the end 'default error handler' (in this type of case "JVM") will handle this

public class MyClass_03 {

    public static void main(String[] args) throws InterruptedException {
        m1();
    }

    public static void m1() throws InterruptedException{
        System.out.println("m1 is working");
        m2();
    }
    public static void m2() throws InterruptedException{
        System.out.println("m2 is working");
        m3();
    }
    public static void m3() throws InterruptedException{
        System.out.println("m3 is working");
        System.out.println(10/0);
        System.out.println("code ends here");
    }
}
