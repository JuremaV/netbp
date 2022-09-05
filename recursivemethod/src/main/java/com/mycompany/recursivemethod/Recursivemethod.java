/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursivemethod;

import java.util.Scanner;

/**
 * Program name   : Assignment 1 - Question 2                                         
 * Subject        : Software Design 2 SDN260S
 * Lecturer       : Mr. H. Mataifa 
 * Student        : Jurema Vidal Francisco                                        
 * Student Number : 221361006                                                     
 * Program Purpose: To Design a JAVA Application that  uses a Recursive Method (recursivePower(double,int)) 
 * Date           : 12/08/2022
 * @author jurem
 */
public class Recursivemethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base number:");
        double baseNumb = input.nextInt();
        System.out.println("Please enter the power number:");
        int powerNumb = input.nextInt();

        System.out.println( "recursivePower " + "(" + baseNumb + "," + powerNumb + ")" 
                + " = " + recursivePower(baseNumb, powerNumb));
    }

    private static double recursivePower(double baseNumb, int powerNumb) {
        if (powerNumb < 0) {
            /* negative exponent: */
            // negative exponent:
            if (powerNumb == -1) {
                return 1 / baseNumb; // base case for negative exponent
            } else {
                return 1 / baseNumb * recursivePower(baseNumb, powerNumb + 1); // recursive call for neg. exponent
            }
        } else {
            /* positive exponent: */

            // Positive exponent:
            if (powerNumb == 1) {
                return baseNumb; // base case for positive exponent
            } else {
                return baseNumb * recursivePower(baseNumb, powerNumb - 1); // recursive call for pos. exponent
            }
        }
    }
}
