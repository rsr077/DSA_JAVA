// File Name: FinallyExample.java

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter Denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("This block always executes (Finally Block).");
        }

        System.out.println("Program completed.");
    }
}
