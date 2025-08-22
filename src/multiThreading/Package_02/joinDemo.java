package multiThreading.Package_02;

public class joinDemo {
    public static void main(String[] args) throws InterruptedException {

        joinThread t1 = new joinThread();
        t1.start();
        t1.join();          // when you use this method you have to put in try-catch, or put InterruptedException on current class
                            // Start the joinThread (calls the run() method)
                            // Main thread waits for t1 to finish
//        t1.interrupt();     // it stops(interrupts) the t1 thread (Generally we don't use)

//        CURRENT THREAD

        for(int i=1; i<=3; i++){
            System.out.println("Main Thread..." + i);
        }
    }
}


class joinThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=3; i++){
            System.out.println("Join Thread..." + i);
        }
    }
}