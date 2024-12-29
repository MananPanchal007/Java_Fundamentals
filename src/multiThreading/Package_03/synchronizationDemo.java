package multiThreading.Package_03;

public class synchronizationDemo{
    public static void main(String[] args) {
        PrintMsg p=new PrintMsg();
        SyncThreadDemo t1=new SyncThreadDemo(p);
        SyncThreadDemo t2=new SyncThreadDemo(p);
        t1.setName("Ye Hai T1");
        t2.setName("Ye Hai T2");
        t1.start();
        t2.start();
    }
}

class SyncThreadDemo extends Thread {
    PrintMsg p;
    SyncThreadDemo(PrintMsg p){
        this.p=p;
    }
    @Override
    public void run() {
        p.m1();
    }
}

//    whole method is synchronized
class PrintMsg{
    public synchronized void m1(){
        for (int i = 1; i < 3; i++) {
                System.out.println("Executed by "+Thread.currentThread().getName());
                System.out.println("Hello Manan...");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("By Manan..."+Thread.currentThread().getName());
        }
    }
}


//    only specific portion is synchronized
//class PrintMsg{
//    public void m1(){
//        for (int i = 1; i < 3; i++) {
//            System.out.println("Executed by "+Thread.currentThread().getName());
//            synchronized (this){              // this mean current object
//                System.out.println("Hello Manan..."+Thread.currentThread().getName());
//            }
//            try{
//                Thread.sleep(1000);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            System.out.println("By Manan..."+Thread.currentThread().getName());
//        }
//    }
//}




