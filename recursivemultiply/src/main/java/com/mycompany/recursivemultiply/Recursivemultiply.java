/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursivemultiply;

import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Recursivemultiply {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the multiplicant number:");
        int multiplicant = input.nextInt();
        System.out.println("Please enter the multiplier number:");
        int multiplier = input.nextInt();

        System.out.println( "Recursivemultiply " + "(" + multiplicant + "," 
                + multiplier + ")" + " = " + Recursivemultiply(multiplicant, multiplier));
    }

    private static double Recursivemultiply( int multiplicant, int multiplier) {
        if (multiplier == 0) {
            return 0;
        } else {
            return (multiplicant + Recursivemultiply(multiplicant, multiplier - 1));
        }
    }
}
