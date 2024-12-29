package multiThreading.Package_02;

public class yieldDemo {
    public static void main(String[] args) {
        yieldThreadDemo t1 = new yieldThreadDemo();
        t1.start();

//        CURRENT THREAD
        for (int i=1; i<=3; i++) {
            System.out.println("Main Thread..." + i);
        }
    }
}

class yieldThreadDemo extends Thread{
    @Override
    public void run() {

        for (int i=1; i<=5; i++) {

//            Thread.yield();   // it poses this process and give chance to another thread
                                // to execute but not taking 100% guarantee
            try{
                Thread.sleep(1000);   // it executes the process after 1000 milliseconds
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Child Thread..." + i);
        }
    }
}