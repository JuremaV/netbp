/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gericcollections5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Gericcollections5 {

    //linearsearch algorithm
    public static void main(String[] args) {
        // instantiate random number generator:
        Random gen = new Random();

        // instantiate array to hold 10 integer elements 
        int[] intArray = new int[10];

        // fill array with random integers in range 10-29:
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (10 + gen.nextInt(20));
        }

        // instantiate Scanner object to accept user input:
        Scanner input = new Scanner(System.in);

        // prompt user to enter integer to search for:
        System.out.println("Please enter an integer to search for: ");
        int searchElement = input.nextInt();

        // use the search algorithm to search for the element:
        int elementIndex = recursiveLinearSearch(intArray, searchElement, 0);

        // output the result of the search
        if (elementIndex < 0) // element not found
        {
            System.out.println(searchElement + " was not found in array: " + Arrays.toString(intArray));
        } else {
            System.out.printf("%d was found at position %d in array: %s",
                    searchElement, elementIndex, Arrays.toString(intArray));
        }
    }

    // recursive linear search algorithm:
    public static int recursiveLinearSearch(int[] array, int searchElement, int searchIndex) {
        if (searchIndex == array.length - 1 && searchElement != array[searchIndex]) {
            return -1;
        }

        if (searchElement == array[searchIndex]) {
            return searchIndex;
        }

        return recursiveLinearSearch(array, searchElement, searchIndex + 1);
    }

}
