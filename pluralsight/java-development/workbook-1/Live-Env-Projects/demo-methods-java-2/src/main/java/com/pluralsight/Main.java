package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        greetUser(name);

        int num1 = 17;
        int num2 = 8;

        int sumResult = addNumbers(num1, num2);
        System.out.println("The result is: " + sumResult);

    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name + " !");
    }

    public static int addNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The result of the sum is: " + sum);
    }

}
