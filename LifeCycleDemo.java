class LifeCycleDemo extends Thread {

    public void run() {
        try {
            System.out.println("Thread is in RUNNING state.");
            Thread.sleep(1000);   // TIMED_WAITING state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LifeCycleDemo t = new LifeCycleDemo();

        // NEW state
        System.out.println("State after creation: " + t.getState());

        // RUNNABLE state
        t.start();
        System.out.println("State after start(): " + t.getState());

        Thread.sleep(200);  // Give time for thread to execute sleep()

        // TIMED_WAITING state
        System.out.println("State during sleep: " + t.getState());

        t.join();  // Wait for thread to finish

        // TERMINATED state
        System.out.println("State after completion: " + t.getState());
    }
}