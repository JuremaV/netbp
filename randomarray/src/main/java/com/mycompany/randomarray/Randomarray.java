/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomarray;
import java.util.Random;

/**
 *
 * @author jurem
 */
public class Randomarray {

    public static void main(String[] args) {
 // instatiating random array variable
        Random generator = new Random();
        
        //Instatiating array of elements variable
        int[] intArray = new int[10];
        
        // Using thre for loop to gererate elements from 10-30
        for (int iCount = 0; iCount < intArray.length; iCount++) {
            int randomNumber = 10 + generator.nextInt(21); // using an offset numb for the lower boundary 
            System.out.println(randomNumber); // print the array to the console
        }
    }
}
