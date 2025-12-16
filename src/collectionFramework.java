import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class collectionFramework {
    public static void main(String[] args) {
//        Prerequisites
//        package
//        interface
//        Class
//        Wrapper classes
//        Generics
//        Objects
//        Iterators
//        Collections
//        Arrays
//        Comparators

//        List
//        ArrayList
//        It is not synchronized and not thread safe
//        Used when we need to access elements by index
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
//        list.add(2, "Manan"); Now bcz of wrapper class it will give error
        System.out.println(list);

//        LinkedList
//        It is not synchronized and not thread safe
//        Used when we need to access elements by index
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(2, 25);
        System.out.println(linkedList);

//        Vector
//        It is synchronized and thread safe
//        Used when we need to access elements by index
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(2, 25);
        System.out.println(vector);

//        Stack
//        It is synchronized and thread safe
//        First In Last Out
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        stack.push(2, 25);
        System.out.println(stack);
    }
}