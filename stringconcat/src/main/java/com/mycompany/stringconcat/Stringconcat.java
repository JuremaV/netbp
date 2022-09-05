/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringconcat;

/**
 *
 * @author jurem
 */
public class Stringconcat {

    public static void main(String[] args) {
        
        String s1= "Happy ";
        String s2= "Birthday";
        
        System.out.printf("s1 = %s\ns2 = %s\n\n", s1,s2 );
        System.out.printf("Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
        System.out.printf("S1 after concatination = %s\n", s1 );
    }
}
