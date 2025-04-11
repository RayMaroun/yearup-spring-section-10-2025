package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello ");
        System.out.println("World");

        System.out.println("====================================");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);
        System.out.println("Total due is: " + String.format("%.2f", totalDue));

        System.out.printf("Total due is: %.2f", totalDue);
        System.out.println();
        System.out.println("====================================");

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.779f;

        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
        System.out.println();
        System.out.println("====================================");

        System.out.printf("|%-10s|", "Java");*/

        /*Scanner myScanner = new Scanner(System.in);

        System.out.println("Please Enter your Name: ");
        String name = myScanner.nextLine();

        System.out.println("Hello Everyone I am " + name + " and I love Potatoes!");

        System.out.println("Please Enter a number: ");
        int firstNumber = myScanner.nextInt();
        System.out.println("The number is: " + firstNumber);*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Which operation you would like to do next?");
        String response = scanner.nextLine();

        System.out.println("The first number is: " + num1 + " and the second number is: " + num2);

        System.out.println("The operation is: " + response);
    }
}
