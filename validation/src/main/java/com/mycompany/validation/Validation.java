/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.validation;
 import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Validation {

    public static void main(String[] args) {
        // Instantiate a (character-based) input stream object (Scanner):
        Scanner input = new Scanner(System.in);

        // Request user to enter telephone number:
        System.out.println("Please enter telephone number in the format: (XXX) XXX-XXXX\n"
                + "3-digit code must be enclosed in parentheses\n"
                + "with space between area code and next 3 digits\n"
                + "and hyphen between next 3 digits and last 4 digits: ");
        String telNumber = input.nextLine();

        // Formulate regular expression:
        String regexp = "\\(0[0-5][0-9]\\) [0-9]{3}-[0-9]{4}";

        boolean telNumberMatches = telNumber.matches(regexp);

        int i = 1;

        while (!telNumberMatches && i < 3) {
            System.out.println("\nEntry is not valid.");
            System.out.println("\nPlease enter telephone number in the format: (XXX) XXX-XXXX\n"
                    + "3-digit code must be enclosed in parentheses\n"
                    + "with space between area code and next 3 digits\n"
                    + "and hyphen between next 3 digits and last 4 digits: ");
            telNumber = input.nextLine();
            telNumberMatches = telNumber.matches(regexp);
            i += 1;
        }
        if (!telNumberMatches) {
            System.out.println("\nMaximum number of attempts reached. Thank you and goodbye.");
        } else {
            String[] telNumberParts = telNumber.split(" ");
            String areaCode = telNumberParts[0].substring(1, 4);
            System.out.printf("\nThank you. Following is the information you entered:\n"
                    + "Area code: %s\nPhone number: %s", areaCode, telNumberParts[1]);
        }
    }
}
