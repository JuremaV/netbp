/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomwords;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jurema
 */
public class Randomwords {

    public static void main(String[] args) {
     String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random rand = new Random();
        int exclusiveIndex = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of sentences to be generated");
        int numberOfSentences = scanner.nextInt();
        String[] sentences = new String[numberOfSentences];

        for (int i = 0; i < numberOfSentences; i++) {
            String article = capitalizeFirstLetter(articles[rand.nextInt(exclusiveIndex)]);
            String noun = nouns[rand.nextInt(exclusiveIndex)];
            String verb = verbs[rand.nextInt(exclusiveIndex)];
            String preposition = prepositions[rand.nextInt(exclusiveIndex)];
            String sentence = article + " " + noun + " " + verb + " " + preposition + ".";

            sentences[i] = sentence;
            System.out.println(sentence);

        }

        try {

            try ( FileWriter myWriter = new FileWriter("question1.txt", true)) {
                for (String s : sentences) {
                    myWriter.write(s + "\n");
                }
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    private static String capitalizeFirstLetter(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
