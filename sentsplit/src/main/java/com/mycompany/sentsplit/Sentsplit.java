/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sentsplit;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author jurem
 */
public class Sentsplit {

    public static void main(String[] args) {

        // Instantiate Scanner object:
        Scanner input = new Scanner(System.in);

        // Request a sentence:
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();

        // Split the sentence into individual words:
        String[] words = sentence.split(" ");

        // Instantiate (character-based) output stream object:
        Formatter outputWriter = null;

        try {
            outputWriter = new Formatter(new BufferedWriter(new FileWriter("words.txt", true)));
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error opening or creating file.");
            System.exit(1);
        } catch (IOException ioe) {
            System.err.println("Error writing to file.");
            return;
        }

        // Print output to screen:
        System.out.println("\nThank you. Following is what you entered:");
        for (String word : words) {
            StringBuilder s = new StringBuilder(word);
            s.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            System.out.printf("%s\n", s.toString());
            outputWriter.format("%s\n", s.toString());
        }
        if (outputWriter != null) {
            outputWriter.close();
        }

        if (input != null) {
            input.close();
        }

    }
}
