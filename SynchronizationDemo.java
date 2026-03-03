// Shared Counter Class
class Counter {
    int count = 0;

    // Synchronized method
    synchronized void increment() {
        count++;
    }
}

// Thread class
class MyThread extends Thread {

    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}