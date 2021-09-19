/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Anthony Sevarino
 */

/* Establish 16 as valid age for legally driving
 * ask user for their age
 * compare to valid age 16
 * if greater than or equal to, user can drive
 * if not, then user cannot drive
 */

package Solution16;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int valid = 16;

        System.out.println("What is your age?");
        int uAge = scnr.nextInt();

        String testCase = (uAge >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(testCase);
    }
}
