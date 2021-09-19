/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Anthony Sevarino
 */

/* Determine gender of user
 * determine ounces of alcohol consumed
 * determine weight of user in pounds
 * determine number of hours since user drank
 * calculate BAC and print proper response
 */


package Solution17;

import java.util.Scanner;

public class Solution17 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a 1 if you are a male or a 2 if you are a female");
        int genderNum = scnr.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        int ozs = scnr.nextInt();

        System.out.println("What is your weight in pounds");
        int lbs = scnr.nextInt();

        System.out.println("How many hours has it been since your last drink?");
        int hrs = scnr.nextInt();
        double bac;
        if(genderNum == 1){
            bac = (ozs * 5.14 / lbs * 0.73) - 0.015 * hrs;
        } else {
            bac = (ozs * 5.14 / lbs * 0.66) - 0.015 * hrs;
        }
        if(bac>=0.08) {
            System.out.println("Your BAC is " + bac + "\nit is not legal for you to drive");
        } else {
            System.out.println("Your BAC is " + bac + "\nit is legal for you to drive");
        }
    }
}
