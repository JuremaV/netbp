/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericcollections4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Genericcollections4 {

    // generic collections for searching 
    public static void main(String[] args) {
        // Instantiate integer, double and string arrays as specified:
        Integer[] integerArray = {8, 21, 6, 1, 24, 9, 47, 36, 18, 38};
        Double[] doubleArray = {14.7, 7.84, 20.58, 26.46, 35.28, 10.78, 35.28, 6.86, 30.87, 17.15};
        String[] stringArray = {"blue", "red", "yellow", "green", "white", "cyan", "magenta", "grey", "black", "brown"};

        // Obtain a list view of each of the arrays, to enable using Collections methods:
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integerArray));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));

        // Instantiate a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer to search for:
        System.out.println("\nEnter an integer to search for: ");
        int intSearchElement = input.nextInt();
        input.nextLine();

        // Prompt user to enter a double to search for:
        System.out.println("Enter a floating point number to search for: ");
        String doubleString = input.nextLine();
        double doubleSearchElement = Double.parseDouble(doubleString);

        // Prompt user to enter a string to search for:
        System.out.println("Enter a string to search for: ");
        String stringSearchElement = input.nextLine();

        // Search for the integer input and print the result of the search:
        int intIndex = search(intSearchElement, integerList);
        if (intIndex < 0) {
            System.out.printf("\n%d was not found in array:\n%s\n", intSearchElement, integerList);
        } else {
            System.out.printf("\n%d was found at index %d in array:\n%s\n", intSearchElement, intIndex,
                    integerList);
        }

        // Search for the double input and print the result of the search:
        int doubleIndex = search(doubleSearchElement, doubleList);
        if (doubleIndex < 0) {
            System.out.printf("\n%.2f was not found in array:\n%s\n", doubleSearchElement, doubleList);
        } else {
            System.out.printf("\n%.2f was found at index %d in array:\n%s\n",
                    doubleSearchElement, doubleIndex, doubleList);
        }

        // Search for the string input and print the result of the search:
        int stringIndex = search(stringSearchElement, stringList);
        if (stringIndex < 0) {
            System.out.printf("\n%s was not found in array:\n%s\n", stringSearchElement, stringList);
        } else {
            System.out.printf("\n%s was found at index %d in array:\n%s\n",
                    stringSearchElement, stringIndex, stringList);
        }
    }

    // Define a generic method to search of an element entered by user:
    public static <T extends Comparable<T>> int search(T searchElement, ArrayList<T> array) {
        Collections.sort(array);
        return Collections.binarySearch(array, searchElement);
    } // end method search
} // end class 


