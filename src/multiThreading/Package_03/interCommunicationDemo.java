package multiThreading.Package_03;


public class interCommunicationDemo{
    public static void main(String[] args) throws InterruptedException{
        ThreadDemo t1=new ThreadDemo();
        t1.start();
        synchronized (t1){            // this portion of code apply lock to t1 and main thread is waiting
            System.out.println("Main thread waiting for t1");
            t1.wait();                // t1 is waiting to notify by ThreadDomo method
            System.out.println("main thread get notification");
            System.out.println(t1.sum);
        }
    }
}

class ThreadDemo extends Thread{
    int sum=0;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread start calculating sum");
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            this.notify();
            System.out.println("child thread giving notification");

        }
    }
}