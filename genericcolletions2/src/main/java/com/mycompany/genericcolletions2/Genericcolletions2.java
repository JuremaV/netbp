/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericcolletions2;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jurem
 */
public class Genericcolletions2 {

    // generic collection operation based on selection sort:
    public static void main(String[] args) {
        // instantiate two ArrayLists, one Integer, one Double, and a random number generator:
        Random generator = new Random();
        ArrayList<Integer> integerArray = new ArrayList<>();
        ArrayList<Double> doubleArray = new ArrayList<>();

        // fill arrays with random ints and doubles in range 10-99:
        for (int i = 0; i < 10; i++) {
            integerArray.add(10 + generator.nextInt(90));
            doubleArray.add(10.0 + 89.0 * Math.round(100 * generator.nextDouble()) / 100);
        }

        // print unsorted integerArray:
        System.out.println("Unsorted integer array: ");
        System.out.println(integerArray);

        // sort integerArray using the generic method sort:
        sort(integerArray);

        // print sorted integer array:
        System.out.println("Sorted integer array:");
        System.out.println(integerArray + "\n");

        // print unsorted double array:
        System.out.println("Unsorted double array: ");
        System.out.println(doubleArray);

        // sort doubleArray using the generic method sort:
        sort(doubleArray);

        // print sorted double array:
        System.out.println("Sorted double array:");
        System.out.println(doubleArray);
    } // end main

    // define generic method sort based on selection sort algorithm:
    public static <T extends Comparable> void sort(ArrayList<T> data) {
        int smallest; // index of smallest element  
// loop over data.size()-1 elements
        for (int i = 0; i < data.size() - 1; i++) {
            smallest = i; // first index of remaining array

            // loop to find index of smallest element
            for (int index = i + 1; index < data.size(); index++) {
                if (data.get(index).compareTo(data.get(smallest)) < 0) {
                    smallest = index;
                }
            }

            // swap smallest element into position
            T temporary = data.get(i); // store larger in temporary
            data.set(i, data.get(smallest)); // place smaller element in right position
            data.set(smallest, temporary); // place larger element in right position
        } // end outer for
    } // end method sort

} // end class 
