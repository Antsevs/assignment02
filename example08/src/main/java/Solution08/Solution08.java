package Solution08;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many people?");
        int ppl = scnr.nextInt();

        System.out.println("How many pizzas do you have?");
        int zas = scnr.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = scnr.nextInt();
        int tSlices = slices * zas;
        System.out.println(ppl + " people with " + zas + " pizzas " + "(" + tSlices + " slices)");

        int zasPerPeep = tSlices / ppl;

        int leftover = tSlices % ppl;

        System.out.println("Each person gets " + zasPerPeep + " piece(s) of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}
