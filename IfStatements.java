// 08/22/25
// s.n

public class IfStatements {
    public static void main(String[] args) {

        int x = 20;
        int y = 8;
        if (x > y) {
            System.out.println("X is smaller");
        }
        boolean isCodingFun = true;

        if (isCodingFun) {
            System.out.println("Yes, Java is fun");

            int pizzaSlicesLeft = 10;
            int totalAmountSlices = 12;

            // Example 1: Check if there are slices left
            if (pizzaSlicesLeft > 0) {
                System.out.println("Grab some before they're all gone!");
            }

            // Example 2: Check if some slices have already been eaten
            if (pizzaSlicesLeft < totalAmountSlices) {
                System.out.println("Looks like someone already had a slice.");
            }
        }
    }
}
