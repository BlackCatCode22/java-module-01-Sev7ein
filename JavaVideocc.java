// 08/22/2025
// s.n

public class JavaVideocc{
    public static void main(String[] args) {

        int myInt = 3;
        double shoeSize = 9.55;
        // char allows characters to be used
        char myInitial = 'S';
        // you can store the results into its own int
        double result = myInt * shoeSize;

        System.out.println(myInt * shoeSize);

        String myname = "John";

        if (myname.equals("John")) {
            System.out.println("This guy is awesome");
        } else if (myname.equals("Larry")) {
            System.out.println("This guy is OK");
        } else {
            System.out.println("Oh well");
        }
        // for loop is ran with i = 0 being the parameter and our starting point. i < 10 means it'll print that amount.
        for (int i = 0; i < 25; i++) {
             System.out.println("These pretzels are making me thirsty");

        }
    }
}