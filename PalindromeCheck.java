import java.util.Scanner;

public class PalindromeCheck {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();          // convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method
        if (isPalindrome(input))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}