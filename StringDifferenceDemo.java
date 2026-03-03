class StringDifferenceDemo {

    public static void main(String[] args) {

        // -------------------- String --------------------
        long startTime = System.currentTimeMillis();

        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str = str + " World";   // Creates new object every time
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");


        // -------------------- StringBuilder --------------------
        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");   // Modifies same object
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");


        // -------------------- StringBuffer --------------------
        startTime = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            sbf.append(" World");  // Thread-safe (synchronized)
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");


        // Final Output Check
        System.out.println("\nFinal Lengths:");
        System.out.println("String Length: " + str.length());
        System.out.println("StringBuilder Length: " + sb.length());
        System.out.println("StringBuffer Length: " + sbf.length());
    }
}