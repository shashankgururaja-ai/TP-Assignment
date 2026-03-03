class GarbageCollectionDemo {

    // Override finalize() method
    protected void finalize() {
        System.out.println("Garbage collected for object: " + this);
    }

    public static void main(String[] args) {

        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("Garbage Collection requested.");
    }
}class GarbageCollectionDemo {

    // Override finalize() method
    protected void finalize() {
        System.out.println("Garbage collected for object: " + this);
    }

    public static void main(String[] args) {

        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("Garbage Collection requested.");
    }
}