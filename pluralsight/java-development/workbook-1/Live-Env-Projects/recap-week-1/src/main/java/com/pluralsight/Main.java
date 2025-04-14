package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = myScanner.nextLine();

        System.out.println("The name of the user is: " + name);*/

        /*float doubleNumber = 35.7565f;
        System.out.printf("The rounded number is: %.2f", doubleNumber);*/


        /*double myDouble = 23.45678976;
        float myFloat;

        myFloat = (float) myDouble;

        System.out.println(myDouble);
        System.out.println(myFloat);*/

        /*int maximumNumber = Math.max(10, 20);
        System.out.println(maximumNumber);*/

        // x++ => Use then increase
        // ++x => Increase then use

        int x = 18; // x is at 18 now
        int y; // y is not assigned yet

        y = x++; // Post-increment: assign x to y first, THEN increment x

        System.out.println(x); // print 19
        System.out.println(y); // print 18

        y = ++x; // Pre-increment: Increment x first, THEN assign to y

        System.out.println(x); // Print 20
        System.out.println(y); // Print 20

    }
}
