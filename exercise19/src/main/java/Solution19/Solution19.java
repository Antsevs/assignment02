/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Anthony Sevarino
 */

package Solution19;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        float weight = scnr.nextFloat();

        System.out.println("What is your height in inches?");
        float height = scnr.nextFloat();

        float BMI = (weight / (height * height)) * 703;

        if(BMI < 25 && BMI > 18.5){
            System.out.println("Your BMI is " + BMI + "\nYou are within the ideal weight range");
        } else if(BMI > 25){
            System.out.println("Your BMI is " + BMI + "\nYou are overweight. You should see your doctor");
        } else if(BMI < 18.5){
            System.out.println("Your BMI is " + BMI + "\nYou are underweight. You should see your doctor");
        }


    }
}
