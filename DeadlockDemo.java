class DeadlockDemo {

    public static void main(String[] args) {

        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked Resource 1");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource 2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked Resource 2");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}