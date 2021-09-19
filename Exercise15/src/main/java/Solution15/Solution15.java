/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Anthony Sevarino
 */

/* establish correct password
 * ask user for their password input
 * compare user input to correct password
 * if correct, reply with Welcome!
 * if incorrect, reply with I don't know you
 */

package Solution15;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String valid = "12--yOu--89";
        System.out.println("What is the password?");
        String uInput = scnr.next();
        if(uInput.equals(valid)){
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
