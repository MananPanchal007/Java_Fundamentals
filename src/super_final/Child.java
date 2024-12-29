package super_final;

class SuperDemo {
    String name;
    void details() {
        System.out.println(name.toUpperCase());
    }
}

public class Child extends SuperDemo{
    String name;
    public void details() {
        super.name = "Parent";     //refers to parent class member
        name = "Child";
        System.out.println(super.name + " and " + name);
        super.details();       //refers to parent class method
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.details();
    }
}
