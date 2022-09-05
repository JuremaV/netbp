/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringconstructors;

/**
 *
 * @author jurem
 */
public class Stringconstructors 
{

    public static void main(String[] args)
    {
       char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'}; 
       String s = "hello";
       
       // use String Constructors
       String s1 = new String();
       String s2 = ( s );
       String s3 = new String( charArray );
       String s4 = new String( charArray, 6, 3 );
       
       System.out.printf(
       "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n ",
       s1, s2, s3, s4 ); // display strings
    } // end main
} // end class StringConstructors
