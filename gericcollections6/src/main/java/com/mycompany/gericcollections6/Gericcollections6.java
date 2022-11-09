/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gericcollections6;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author jurem
 */
public class Gericcollections6 {

    // operations using genreric methods and collections:
    public static void main(String[] args) {
        // instantiate Integer and Double arrays, each of size 10:
        Integer[] intArray = new Integer[10];
        Double[] doubleArray = new Double[10];

        // instantiate random number generator:
        Random gen = new Random();

        // generate random numbers to populate the arrays:
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (1 + gen.nextInt(49));
            doubleArray[i] = (double) (1.0 + 0.48 * Math.round(100 * gen.nextDouble()));
        }

        // perform array operations on integer array:
        System.out.println("\nInteger array: " + Arrays.toString(intArray));
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        genericArrayOperations(intList);

        // perform array operations on double array:
        System.out.println("Double array: " + Arrays.toString(doubleArray));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));
        genericArrayOperations(doubleList);
    }

    // generic method to perform array operations
    public static <T extends Comparable<T>> void genericArrayOperations(ArrayList<T> array) {
        T minimumValue = Collections.min(array);
        T maximumValue = Collections.max(array);

        HashMap<T, Integer> map = new HashMap<>();

        for (int i = 0; i < array.size(); i++) {
            if (map.containsKey(array.get(i))) {
                map.put(array.get(i), map.get(array.get(i)) + 1);
            } else {
                map.put(array.get(i), 1);
            }
        }

        HashSet<T> set = new HashSet<>(map.keySet());

        System.out.println("\nMinimum element of the array: " + minimumValue);
        System.out.println("Maximum element of the array: " + maximumValue);
        System.out.println("\nElements and their count:");
        System.out.println("Element\t\t\tCount");
        for (T key : set) {
            System.out.printf("%s\t\t\t%s\n", key, map.get(key));
        }
    }

}
