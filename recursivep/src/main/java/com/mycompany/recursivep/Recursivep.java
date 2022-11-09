/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursivep;

import java.util.Scanner;

/**
 * RECURSIVE POWER
 * 
 * @author jurem
 */
public class Recursivep {

    public static void main(String[] args) {

        // Instantiate Scanner object:
        Scanner input = new Scanner(System.in);
        // Request user to input base:
        System.out.println("Please enter the base: ");
        double base = input.nextDouble();

        // Request user to input exponent:
        System.out.println("Please enter the exponent (must be integer): ");
        int exp = input.nextInt();

        // Compute the exponentiation and output result to screen:
        System.out.printf("%.4f exponent %d = %.4f\n", base, exp,
                recursivePower(base, exp));

    }

    public static double recursivePower(double base, int exp) {

        if (exp < 0) {
            /* negative exponent: */
            // negative exponent:
            if (exp == -1) {
                return 1 / base; // base case for negative exponent
            } else {
                return 1 / base * recursivePower(base, exp + 1); // recursive call for neg. exponent
            }
        } else {
            /* positive exponent: */

            // Positive exponent:
            if (exp == 1) {
                return base; // base case for positive exponent
            } else {
                return base * recursivePower(base, exp - 1); // recursive call for pos. exponent
            }
        }
    }
}

