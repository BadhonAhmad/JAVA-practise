package mypack.Thread;

class myThread1 extends Thread {
    public void run() {
        while(true){
            System.out.println("I am thread 1.");
            System.out.println("i am happy");
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        while(true){
            System.out.println("Thread 2 is good.");
            System.out.println("I am sad");
        }
    }
}
public class Thread {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();
    }

}
