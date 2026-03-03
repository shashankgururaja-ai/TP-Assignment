import java.util.Scanner;

public class ReverseStringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using StringBuilder to reverse
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());

        sc.close();
    }
}