/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.driverclass;
import java.util.Scanner;
/**
 *
 * @author jurem
 */
public class simpleClass {
    
    // Display my students details
    public void displayStudentDetails()
    {
        Scanner input = new Scanner(System.in);
       
        // Request the user to enter the following inputs: 
      
        System.out.println("Please enter your First name: ");
        String firstName = new String(input.nextLine());
        
       System.out.println("Please enter your Initials: ");
        String initials = new String(input.nextLine()); 
        
        System.out.println("Please enter your Last name: ");
        String lastName = new String(input.nextLine());
        
        System.out.println("Please enter your Student number: ");
        String studentNumber = new String(input.nextLine());
        
        System.out.println("Please enter your Program: ");
        String choiceOfProgram = new String(input.nextLine());
        
        // The expected output from the user input to the screen:
        
        System.out.println("\nFind your Student Details bellow:\n");
        
        System.out.printf("Initials and Surname: %s %s\n", initials, lastName);
        System.out.printf("Student number: %s\n", studentNumber);
        System.out.printf("Student email: %s\n", studentNumber + "@mycput.ac.za"); 
        System.out.printf("Program: %s\n", choiceOfProgram);

    } //End of method displayStudentDetails 

    void diplayMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
