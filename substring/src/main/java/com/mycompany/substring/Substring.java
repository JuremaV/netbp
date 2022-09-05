/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.substring;

/**
 *
 * @author jurem
 */
public class Substring {

    public static void main(String[] args) {
        
        String myName = "JuremaVidalFrancisco";
        
        System.out.printf("Sbstring from index 7 to the end is \"%s\"\n", myName.substring(7));
        
        System.out.printf("%s \"%s\"\n", 
                "Sbstring from index 3 up to, but not including 6 is", myName.substring(3, 6));
    } // end main
}// end class Substring
