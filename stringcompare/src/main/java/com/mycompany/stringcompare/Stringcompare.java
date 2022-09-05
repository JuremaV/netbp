/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringcompare;
import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Stringcompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = new String(input.nextLine());

        System.out.println("Enter the second string");
        String str2 = new String(input.nextLine());
        int comp = str1.compareTo(str2);

        if (comp > 0) {
            System.out.print("\n String one is greater than String 2");
        } else if (comp < 0) {
            System.out.print("\nString 1 is smaller than string 2");
        }

        if (comp == 0) {
            System.out.print("\nString 1 is equal to string 2");
        }
    }
}
