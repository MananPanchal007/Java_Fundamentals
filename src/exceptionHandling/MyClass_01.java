package exceptionHandling;

public class MyClass_01 {
    public static void main(String[] args) {
        System.out.println("Manan");
        m1();
        System.out.println("Panchal");
    }

    public static void m1(){
        System.out.println("Hello M1");
        m2();
        System.out.println("Bye M1");
    }

    public static void m2(){
        System.out.println("Hello M2");
        try {
            System.out.println("try block");
            System.out.println(10 / 0);
        }
        catch(Exception e){
            System.out.println("catch block");
//            e.printStackTrace();                    // gives location, description and error name
//            e.toString();
//            System.out.println(e.toString());       // gives only error name and description
//            e.getMessage();
//            System.out.println(e.getMessage());     // gives only description
        }
        finally{
            System.out.println("finally is done");
        }
        System.out.println("Bye M2");
    }
}
