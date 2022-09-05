/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linearsearch;
import java.util.Random;
import java.util.Arrays;


/**
 *
 * @author jurem
 */
public class Linearsearch {

    private int[] data; // array of values
    private static final Random generator = new Random();

// create array of given size and fill with random numbers
    public Linearsearch(int size) {
        data = new int[size]; // create space for array

// fill array with random ints in range 10-99
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    } // end LinearArray constructor

    public int linearSearch(int searchKey) {
        return recursiveLinearSearch(searchKey, 0);
    }

// perform a recursive linear search on the data
    private int recursiveLinearSearch(int searchKey, int leftIndex) {
// loop through array recursively
        if (leftIndex > data.length - 1) {
            return -1; // integer was not found
        }
        if (searchKey == data[leftIndex]) {
            return leftIndex;
        }
        return recursiveLinearSearch(searchKey, leftIndex + 1);
    } // end method linearSearch

// method to output values in array
    public String toString() {
        return Arrays.toString(data);
    } // end method toString
} // end class LinearArray
