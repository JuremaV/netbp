/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recurseven;

import java.util.Scanner;

/**
 * RECURSIVE SUM EVEN NUMB
 * @author jurem
 */
public class Recurseven {

    public static void main(String[] args) {
        
        // Instantiate a Scanner object to retrieve user input from keyboard:
        Scanner input = new Scanner(System.in);

        // Prompt user for input:
        System.out.println("Please enter an integer (positive or negative): ");

        // Loop until user enters valid input (i.e. integer, positive or negative):
        while (!input.hasNextInt()) {

            System.out.println("Number entered is not a valid integer."
                    + "Please enter a valid integer (positive or negative): ");
            input.nextLine();
        }
        // Once valid input is entered, assign it to integer variable n:
        int n = input.nextInt();

        // Compute the sum of even numbers, and print to screen:
        if (n >= 0) {
            System.out.printf("Sum of even numbers between 0 and %d is %s.\n",
                    n, recursiveSumEvenNumbers(n));
        } else {
            System.out.printf("Sum of even numbers between %d and 0 is %s.\n",
                    n, recursiveSumEvenNumbers(n));
        }
    }

    // Define recursive method to compute sum of even numbers between 0 and n:
    public static int recursiveSumEvenNumbers(int n) {
        if (n < 0) {
            /* check whether user entered a negative number */
            if (n % 2 == -1) /* check whether user entered an odd number. If so, increment */ {
                n += 1;
            }
            if (n == 0) /* base case for negative n */ {
                return n;
            } else {
                return n + recursiveSumEvenNumbers(n + 2); /* recursive call for negative n */
            }

        } else {
            if (n % 2 == 1) /* check whether user entered an odd number. If so, decrement */ {
                n -= 1;
            }
            if (n == 0) /* base case for positive n */ {
                return n;
            } else {
                return n + recursiveSumEvenNumbers(n - 2); /* recursive call for positive n */
            }
        }
    }
}
