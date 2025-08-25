// 08/24/25
// s.n
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get student's name (char for first initial)
        System.out.print("Enter your first initial: ");
        char initial = input.next().charAt(0);

        // get test scores
        System.out.print("Enter your first test score (int): ");
        int test1 = input.nextInt();

        System.out.print("Enter your second test score (double): ");
        double test2 = input.nextDouble();

        // math: calculate average
        double average = (test1 + test2) / 2.0;

        System.out.println("\nStudent " + initial + "'s average is: " + average);

        // use if/else to assign a letter grade
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
