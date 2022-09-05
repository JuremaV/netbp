/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringmiscellaneaus;

/**
 *
 * @author jurem
 */
public class Stringmiscellaneaus {

    public static void main(String[] args) {
       String s1 = "Hello there";
       char[] charArray = new char[ 5 ];
       
       System.out.printf("s1: %s", s1);
       
       // test lengh method
       System.out.printf("\nLength of s1: %d", s1.length() );
       
       //loop through characters in s1 with charAt and display reversed
       System.out.print("\nThe string reversed is: ");
       
       for ( int count = s1.length() - 1; count >=0; count-- )
           System.out.printf("%c", s1.charAt( count) );
       
       // copy characters from string into charArray
       s1.getChars(0, 5, charArray, 0);
       System.out.print("\nThe character array is: ");
       
       for (char character : charArray)
           System.out.print( character );
       
       System.out.println();
    }// end main
} // end class Stringmiscellaneous
