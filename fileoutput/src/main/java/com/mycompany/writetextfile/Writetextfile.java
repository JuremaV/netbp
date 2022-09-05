/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.writetextfile;
//import java.util.Random;
import java.util.Scanner;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jurem
 */
public class Writetextfile {

    public static void main(String[] args) {
        
        // Instantiate a (character-based) input stream object (Scanner):
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence of your choice: ");
        String sent = input.nextLine();

        // Split the sentence into individual words:
        String[] sentWords = sent.split(" ");

        // Instantiate (character-based) output stream object:
        Formatter outputWrite = null;

        try {
            outputWrite = new Formatter(new BufferedWriter(new FileWriter("words.txt", true)));
        } catch (FileNotFoundException fnfe) {
            System.err.println("An Error occured while creating/opening file.");
            System.exit(1);
        } catch (IOException ioe) {
            System.err.println("An Error occured while writing to file.");
            return;
        }

        // Print output to screen:
        System.out.println("\nOkie-dokie. Your sentence format changed to:");
        for (String sentence : sentWords) {
            StringBuilder string = new StringBuilder(sentence);
            string.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
            System.out.printf("%s\n", string.toString());
            outputWrite.format("%s\n", string.toString());
        }
        if (outputWrite != null) {
            outputWrite.close();
        }

        if (input != null) {
            input.close();
        }
    }
}
