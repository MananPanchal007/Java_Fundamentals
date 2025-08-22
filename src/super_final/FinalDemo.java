package super_final;

// Here final means every variable, method and class is now immutable,
// can not be changed, override or extend respectively.

public final class FinalDemo {
    final int a=10;
//    a=20;  --> invalid
//    final int c;  --> invalid

    final void m1(){
        System.out.println("Hello");
    }

    public static void main(String[] arg){
        FinalDemo d = new FinalDemo();
        d.m1();
        System.out.println("Value of a: " + d.a); // Accessing final variable 'a'
    }

//    class Test extends FinalDemo(){} --> invalid
}
