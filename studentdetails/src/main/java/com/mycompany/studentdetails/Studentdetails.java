/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studentdetails;
import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Studentdetails {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Request first name:
        System.out.println("Please enter your First NAme(s): ");
        String firstNames = new String(input.nextLine());
        
        // Request last name;
        System.out.println("Please enter your Last Name: ");
        String lastName = new String(input.nextLine());
        
        // Request student number: 
        System.out.println("Please enter your Student Number: ");
        String studentNumber = new String(input.nextLine());
        
        //Tokenize first names:
        String[] firstNameArray = firstNames.split(" ");
        
        //
        StringBuilder initials = new StringBuilder(" ");
        
        //
        for (String firstName:firstNameArray)
            initials.append(firstName.charAt(0));
        
        //Output user input to screen:
        System.out.println("\nThank you. Bellow are your Student Details:");
        
        System.out.printf("\nInitials and Surname: %s  %s\n", initials, lastName);
        System.out.printf("Student Number: %s\n", studentNumber);
        System.out.printf("Email Address: %s\n", studentNumber + "@mycput.ac.za");
    }
}
