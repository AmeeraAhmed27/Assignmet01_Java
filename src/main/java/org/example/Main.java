package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Java Assignment Solver ---");

        // 1. Ask the user to enter two integers
        System.out.print("Enter the first integer (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer (num2): ");
        int num2 = scanner.nextInt();

        // Close the scanner as we no longer need input
        scanner.close();


        // --- 1. Arithmetic operations ---
        System.out.println("\n--- 1. Arithmetic Operations ---");

        // Print the sum
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Print the difference
        int difference = num1 - num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Print the product
        long product = (long) num1 * num2; // Use long for product to prevent potential overflow
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Print the remainder of num1 % num2
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("The remainder of " + num1 + " % " + num2 + " is: " + remainder);
        } else {
            System.out.println("Cannot calculate remainder: num2 is zero (Division by zero).");
        }

        // --- 2. If conditions ---
        System.out.println("\n--- 2. If Conditions ---");

        // Print which number is greater
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            // This case is also covered by the equality check below, but included here for completeness
            // regarding the "greater" comparison.
            System.out.println(num1 + " and " + num2 + " are equal.");
        }

        // Print whether the two numbers are equal or not
        if (num1 == num2) {
            System.out.println("The two numbers are equal.");
        } else {
            System.out.println("The two numbers are not equal.");
        }

        // --- 3. Logical operators (using if-else if-else structure) ---
        System.out.println("\n--- 3. Logical Operators ---");

        // If both numbers are greater than 0
        if (num1 > 0 && num2 > 0) { // Uses the logical AND operator (&&)
            System.out.println("Both are positive");
        }
        // If only one of them is greater than 0
        else if ((num1 > 0 && num2 <= 0) || (num1 <= 0 && num2 > 0)) { // Uses logical AND (&&) and OR (||)
            System.out.println("One is positive");
        }
        // Otherwise (neither is positive, or both are zero/negative)
        else {
            System.out.println("No positives");
        }


        // --- 4. Ternary operator ---
        System.out.println("\n--- 4. Ternary Operator ---");

        // Print which number is greater using the ternary operator
        // The structure is: (condition) ? value_if_true : value_if_false
        String greaterNumberCheck = (num1 > num2) ?
                num1 + " is greater." :
                (num2 > num1) ? num2 + " is greater." : "Both numbers are equal.";

        System.out.println("Greater number (Ternary): " + greaterNumberCheck);

        // Print whether num1 is even or odd using the ternary operator
        // An even number has a remainder of 0 when divided by 2
        String evenOrOdd = (num1 % 2 == 0) ? "even" : "odd";
        System.out.println(num1 + " is " + evenOrOdd + " (Ternary).");

        System.out.println("--- Program Finished ---");
        }
    }
