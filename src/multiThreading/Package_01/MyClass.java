package multiThreading.Package_01;

public class MyClass {
    public static void main(String[] args) {

//        1 First way to make and start a thread
        Demo_01 t1 = new Demo_01();
        t1.start();

//        2 Second way to make and start a thread (Better way to use thread)
        Demo_02 d = new Demo_02();
        Thread t2 = new Thread(d);   // we are targeting specific thread from here
        t2.start();

//        some features of thread

//        NAME
//        System.out.println(t1.getName());                            // here t1 thread has no name, so we will get it's name as Thread-0
//        Thread.currentThread().setName("JayShreeRam Thread");        // now from here we declare t1's name as JaySh...
//        System.out.println(Thread.currentThread().getName());

//        PRIORITY
//        System.out.println(Thread.currentThread().getPriority());    // to get priority
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        Thread.currentThread().setPriority(1);                       // setting the priority
//        t1.setPriority(9);
//        System.out.println(t1.getPriority());
//        System.out.println(Thread.currentThread().getPriority());


//        CURRENT THREAD
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread..." + i);
        }

    }
}

//        1 First way to make and start a thread

class Demo_01 extends Thread {
    @Override
    public void run() {
//        job
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread_Demo_01..." + i);
        }
    }
}

//        2 Second way to make and start a thread (Better way to use thread)
class Demo_02 implements Runnable {
    @Override
    public void run() {
        //job
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread_Demo_02..." + i);
        }
    }
}