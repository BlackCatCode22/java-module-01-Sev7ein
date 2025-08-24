// 08/23/25
// s.n
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        // setting up the input
        Scanner myObj = new Scanner(System.in);
        //allows user to enter input
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        Scanner myObjtwo = new Scanner(System.in);
        System.out.println("Enter Age and Salary");

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);


        }
    }