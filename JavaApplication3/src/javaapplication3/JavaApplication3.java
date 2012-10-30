/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.*;

/**
 *
 * @author dominic
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        String eingabe;
        int zahl;
        eingabe = input.readLine();
        zahl = Integer.parseInt(eingabe);
        for (int i = 1; i < 10; i++) {
            System.out.println("HELLO");



        }
    }
}
