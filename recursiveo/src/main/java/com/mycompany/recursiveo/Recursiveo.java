/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursiveo;
import java.util.Scanner;

/**
 *RECURSIVE SUM ODD NUMBERS
 * @author jurem
 */
public class Recursiveo {

    public static void main(String[] args) {
        // Instantiate a (character-based) input stream object (Scanner):
        Scanner input = new Scanner(System.in);
        // Request user to enter upper limit for the computation:
        System.out.println("Please enter maximum number up to which "
                + "sum of odd numbers must be computed: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("\nNumber must be greater than zero.");
            System.out.println("Please enter maximum number up to which "
                    + "sum of odd numbers must be computed: ");
            n = input.nextInt();
        }
        System.out.printf("sum of odd numbers between 0 and %d is %d\n",
                n, recursiveSumOddNumbers(n));
    }

    // Define recursive method to compute sum of odd numbers up to n:
    public static int recursiveSumOddNumbers(int n) {
        if (n % 2 == 0) {
            n -= 1;
        }
        if (n == 1) {
            return n;
        } else {
            return n + recursiveSumOddNumbers(n - 2);
        }
    }
}
