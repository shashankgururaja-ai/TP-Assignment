import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking marks input
        System.out.print("Enter student's marks (0–100): ");
        int marks = sc.nextInt();

        // Convert marks to grade range
        int gradeKey = marks / 10;

        switch (gradeKey) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                if (marks >= 0 && marks < 60)
                    System.out.println("Grade: F");
                else
                    System.out.println("Invalid marks entered.");
        }

        sc.close();
    }
}