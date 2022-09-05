/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.randomsentences;
import java.util.Random;
import java.util.Scanner;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *Program name    : Assignment 1 - Question 1                                         
 * Subject        : Software Design 2 SDN260S
 * Lecturer       : Mr. H. Mataifa 
 * Student        : Jurema Vidal Francisco                                        
 * Student Number : 221361006                                                     
 * Program Purpose: To Write a JAVA Application that  Randomizes Sentences 
 * Date           : 12/08/2022
 * @author jurem
 */
public class Randomsentences {

    public static String randomizedSentences() {

        // String arrays of words (articles, nouns, verbs, and prepositions
        String articles[] = {"the", "a", "one", "some", "any"};
        String nouns[] = {"boy", "girl", "dog", "town", "car"};
        String verbs[] = {"drove", "jumped", "ran", "walked", "skipped"};
        String prepositisions[] = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        // To get random words from each array
        String randArticle1 = articles[random.nextInt(articles.length)];
        randArticle1 = randArticle1.substring(0, 1).toUpperCase() + randArticle1.substring(1);

        String randArticle2 = articles[random.nextInt(articles.length)];
        String randNoun1 = nouns[random.nextInt(nouns.length)];
        String randNoun2 = nouns[random.nextInt(nouns.length)];
        String randVerb = verbs[random.nextInt(verbs.length)];
        String randPreposition = prepositisions[random.nextInt(prepositisions.length)];

        // Concatenating all the random words
        String line = randArticle1 + " " + randNoun1 + " " + randVerb + " " + randPreposition + " "
                + randArticle2 + " " + randNoun2 + ".";

        return line;
    }

    public static void main(String[] args) {
        // generate 20 sentences
        for (int sentence = 1; sentence <= 20; sentence++) {
            System.out.println(randomizedSentences());
        }
    }
}
