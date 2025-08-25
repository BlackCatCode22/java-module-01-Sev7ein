// 08/24/25
// s.n
import java.util.Scanner;

public class MyOwnExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Computer Class!");
        System.out.println("The teacher gives you 3 choices for today’s activity:");
        System.out.println("1. Practice Java coding");
        System.out.println("2. Play a typing speed game");
        System.out.println("3. Browse the internet (not allowed!)");

        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("You chose Java coding. Great choice! You learn about if-statements.");
        } else if (choice == 2) {
            System.out.println("You play a typing game. Your speed improves, and the teacher is impressed.");
        } else if (choice == 3) {
            System.out.println("Uh oh! The teacher catches you browsing. You lose computer privileges for the day.");
        } else {
            System.out.println("That’s not a valid option. The teacher tells you to pay attention!");
        }

        input.close();
    }
}
