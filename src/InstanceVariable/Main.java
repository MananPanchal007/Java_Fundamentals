package InstanceVariable;

public class Main {
    int a = 10;
    int b;

    public static void main(String[] args) {
        Main InstanceVariable = new Main();
        System.out.println(InstanceVariable.a);
        System.out.println(InstanceVariable.b);

        InstanceVariable.a = 20;
        InstanceVariable.b = 30;
        System.out.println(InstanceVariable.a);
        System.out.println(InstanceVariable.b);
        
    }
}


