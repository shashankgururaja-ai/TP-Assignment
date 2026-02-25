import java.util.Scanner;

public class CheckNumberSign {

    // Function to check the sign of number
    public static void checkSign(int num) {
        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling function
        checkSign(number);

        sc.close();
    }
}