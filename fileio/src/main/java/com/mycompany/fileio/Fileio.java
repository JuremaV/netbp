/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fileio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jurem
 */
public class Fileio {

    public static void main(String[] args) {

    String[] names = {"John", "Carl", "Jerry"};
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Writing to a file.");
      writer.write("\nHere is another line.");
      
      for (String name : names) {
        writer.write("\n" + name);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
