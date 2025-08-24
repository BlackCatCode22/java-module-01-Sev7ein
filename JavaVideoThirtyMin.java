// 08/24/25
// s.n

import java.util.Scanner;
import java.util.*;


public class JavaVideoThirtyMin {
    public static void main(String[] args) {
        class Animal {

            public static final double FAVNUMBER = 1.6180;
            // private means it can be used to call back on within the file

            private String name;
            private int weight;
            private boolean hasOwner = false;
            private byte age;
            private long uniqueID;
            private char favoriteChar;
            private double speed;
            private float height;

            // code can only be used with what's in the file package.
            protected static int numberOfAnimals = 0;
            static Scanner userinput = new Scanner(System.in);

            public Animal() {
                numberOfAnimals++;

                int sumOfNumbers = 5 + 1;
                System.out.println("5 + 1 = " + sumOfNumbers);

                int diffOfNumbers = 5 - 1;
                System.out.println("5 - 1 = " + diffOfNumbers);

                int multOfNumbers = 5 * 1;
                System.out.println("5 * 1 = " + sumOfNumbers);

                int divOfNumbers = 5 / 1;
                System.out.println("5 / 1 = " + sumOfNumbers);

                int modOfNumbers = 5 % 3;
                System.out.println("5 % 3 = " + sumOfNumbers);
            }



        }
    }
}