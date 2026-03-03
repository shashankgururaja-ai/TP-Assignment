import java.io.*;

class ExceptionDemo {

    // Method to demonstrate Checked Exception
    static void checkedExample() throws IOException {
        FileReader file = new FileReader("sample.txt"); // May cause FileNotFoundException
        file.close();
    }

    // Method to demonstrate Unchecked Exception
    static void uncheckedExample() {
        int arr[] = {10, 20, 30};
        System.out.println(arr[5]); // Causes ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {

        // ---------------- Checked Exception ----------------
        try {
            checkedExample();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        // ---------------- Unchecked Exception ----------------
        try {
            uncheckedExample();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}