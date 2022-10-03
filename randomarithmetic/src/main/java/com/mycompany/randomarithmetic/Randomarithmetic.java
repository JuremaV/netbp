/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomarithmetic;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Random;

/**
 *
 * @author jurem
 */
public class Randomarithmetic {

    public static void main(String[] args) throws IOException {
        // Instantiate a random number generator:
        Random generator = new Random();
        // Instantiate two arrays of type double and size 10:
        double[] operand1 = new double[10];
        double[] operand2 = new double[10];
        // Instantiate a String array containing the arithmetic operations
        // to be performed:
        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};

        // Instantiate a character-based output stream object:
        Formatter output = new Formatter(new BufferedWriter(new FileWriter("arithmetic_operations.txt", true)));

        // Populate the arrays with random numbers in the specified ranges:
        for (int i = 0; i < operand1.length; i++) {
            operand1[i] = 20.0 * Math.round((generator.nextDouble()) * 1000) / 1000;
            operand2[i] = 1.0 + 19.0 * Math.round((generator.nextDouble()) * 1000) / 1000;

        }
        // Output the generated arrays:
        System.out.println("\nGenerated random double arrays:");
        System.out.printf("Array 1 content: %s\n", Arrays.toString(operand1));
        System.out.printf("Array 2 content: %s\n", Arrays.toString(operand2));

        System.out.println("\nFollowing operations have been carried out:");
        // Write the same information to a text file:
        output.format("\nGenerated random double arrays:"
                + "\nArray 1 content: %s\nArray 2 content: %s\n"
                + "\nFollowing operations have been carried out:\n",
                Arrays.toString(operand1), Arrays.toString(operand2));

        // Instantiate some variables to be used in the arithmetic operations:
        String operation = null;
        double result = 0.0;
        char opChar = ' ';

        // Loop through the array elements and perform the randomized
        // arithmetic operations:
        for (int i = 0; i < 10; i++) {
            // Randomly select the arithmetic operation to perform:
            operation = operations[generator.nextInt(4)];

            // Use the selected operation in a switch..case statement
            // to execute the right operation:
            switch (operation) {
                case "Add":
                    result = operand1[i] + operand2[i];
                    opChar = '+';
                    break;
                case "Subtract":
                    result = operand1[i] - operand2[i];
                    opChar = '-';
                    break;
                case "Multiply":
                    result = operand1[i] * operand2[i];
                    opChar = '*';
                    break;
                    //5
                case "Divide":
                    result = operand1[i] / operand2[i];
                    opChar = '/';
                    break;
                default:
                    break;
            }
            // Print the result to screen and write to file:
            System.out.printf("%.2f %c %.2f = %.2f\n", operand1[i],
                    opChar, operand2[i], result);
            output.format("%.2f %c %.2f = %.2f\n", operand1[i],
                    opChar, operand2[i], result);
        }
        // close the output file stream:
        output.close();

    }
}
