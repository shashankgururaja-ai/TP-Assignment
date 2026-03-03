
import java.util.Scanner;

public class AgeValidation {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
        System.out.println("Program continues...");
    }
}
