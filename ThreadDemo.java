// Creating thread using Thread class
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread created using Thread class.");
    }
}

// Creating thread using Runnable interface
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable interface
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);
        t2.start();
    }
}