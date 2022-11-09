/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomsent;
import java.util.Random;
import java.util.Scanner;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author jurema
 */
public class Randomsent {

    public static void main(String[] args) {
        // 1. Define the four string arrays
        String[] article = {"the", "a", "one", "some", "any"};
        // array "article" has 5 elements, index running from 0 to 4
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        // 2. Instantiate a random-number generator (for integers):
        Random rand = new Random();

        // 4.1 Request user to specify number of sentences to generate:
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sentences to generate\n"
                + "(must be an integer)");
        int num = input.nextInt();

        // 4.3 Output the generated sentences to a file
        Formatter outputwriter = null;

        // we need to use try...catch construct, to perform file I/O:
        try {
            outputwriter = new Formatter(new BufferedWriter(new FileWriter("sentences.txt", true)));
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error opening or creating the file.");
            System.exit(1);
        } catch (IOException ioe) {
            System.err.println("Error writing to the file.");
            return;
        }

        // 3. Build a sentence as specified (with randomized selection of words for the sentence)
        for (int i = 0; i < num; i++) {
            // 4.2 Capitalize first letter of first word for every sentence:
            StringBuilder firstWord = new StringBuilder(article[rand.nextInt(article.length)]);
            firstWord.setCharAt(0, Character.toUpperCase(firstWord.charAt(0)));
            String sentence = firstWord.toString() + " "
                    + noun[rand.nextInt(noun.length)] + " "
                    + verb[rand.nextInt(verb.length)] + " "
                    + preposition[rand.nextInt(preposition.length)] + " "
                    + article[rand.nextInt(article.length)] + " "
                    + noun[rand.nextInt(noun.length)]+ ".";

            // Output generated sentence to screen:
            System.out.println(sentence);
            // write generated sentence to text file:
            outputwriter.format("%s\n", sentence);
        }
        input.close();
        outputwriter.close();
    }
}
