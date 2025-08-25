// 08/24/25
// s.n
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user how many scoops were sold of each flavor
        System.out.print("Enter number of Vanilla scoops sold: ");
        int vanilla = input.nextInt();

        System.out.print("Enter number of Chocolate scoops sold: ");
        int chocolate = input.nextInt();

        System.out.print("Enter number of Strawberry scoops sold: ");
        int strawberry = input.nextInt();

        int bestSeller;

        // compare which flavor sold the most
        if (vanilla >= chocolate && vanilla >= strawberry) {
            bestSeller = vanilla;
            System.out.println("Vanilla is the best-seller with " + bestSeller + " scoops!");
        } else if (chocolate >= vanilla && chocolate >= strawberry) {
            bestSeller = chocolate;
            System.out.println("Chocolate is the best-seller with " + bestSeller + " scoops!");
        } else {
            bestSeller = strawberry;
            System.out.println("Strawberry is the best-seller with " + bestSeller + " scoops!");
        }

        input.close();
    }
}
