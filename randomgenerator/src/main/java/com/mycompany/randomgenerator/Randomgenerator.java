/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomgenerator;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

/**
 *
 * @author jurem
 */
public class Randomgenerator {

    public static void main(String[] args) {
      
        // declare some variables to be used:
        Random generator = new Random();
        Integer[] array = new Integer[10];
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // generate array of random integer within specified range:
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + generator.nextInt(21);

        }
        // print generated array:
        System.out.printf("\nGenerated random integer array: %s\n", Arrays.toString(array));

        // obtain list of of array, and sort using Collections method sort:
        list = Arrays.asList(array);
        Collections.sort(list);

        // print sorted array:
        System.out.printf("Sorted array: %s\n", list.toString());

        // compute sum and average of array:
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length;

        // print sum and average:
        System.out.printf("\nSum of array elements is: %d\nAverage is: %.2f\n",
                sum, average);

        // use HashMap to count number of unique array elements:
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        // print results:
        System.out.println("\nCount of the array elements:");
        System.out.println("Element\t\tCount");
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.printf("%5d%15d\n", key, map.get(key));
        }

        // use HashSet to remove duplicates from the array, and print to screen:
        Set<Integer> noDuplicateSet = new HashSet<Integer>(Arrays.asList(array));
        System.out.println("\nArray with duplicates removed: " + noDuplicateSet.toString());

        List<Integer> list2 = new ArrayList<Integer>(keySet);
        Collections.sort(list2);
        System.out.println("\n(Sorted) array with duplicates removed: " + list2.toString());
    }
}
