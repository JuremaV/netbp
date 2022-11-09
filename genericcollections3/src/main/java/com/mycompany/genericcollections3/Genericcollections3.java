/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericcollections3;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jurem
 */
public class Genericcollections3 {

    // generic bubble sort
    public static void main(String[] args) {

        Random gen = new Random();

        // instantiate two ArrayLists, one for integers, another for doubles:
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        // generate the random integer and double elements as specified:
        for (int i = 0; i < 10; i++) {
            integerList.add(1 + gen.nextInt(49));
            doubleList.add(1 + 48 * (double) Math.round(gen.nextDouble() * 100) / 100);
        }
        // print the unsorted and sorted arrays:
        System.out.println("\nUnsorted integer array: " + integerList.toString());
        bubbleSort(integerList);
        System.out.println("Sorted integer array: " + integerList.toString());

        System.out.println("\nUnsorted double array: " + doubleList.toString());
        bubbleSort(doubleList);
        System.out.println("Sorted double array: " + doubleList.toString());

    } // end main method
// define generic bubble sort algorithm

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 1; j < array.size() - i; j++) {
                if (array.get(j).compareTo(array.get(j - 1)) < 0) {
                    T temp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    } // end method bubbleSort

} // end class
