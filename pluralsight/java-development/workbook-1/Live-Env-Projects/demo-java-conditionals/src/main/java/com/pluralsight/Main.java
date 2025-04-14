package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

/*        double price;

        if (age < 18) {
            price = 18.00;
        } else {
            price = 25.00;
        }*/

        double price = (age < 18) ? 18.00 : 25.00;





        System.out.println("The price is: " + price);

        if (age == 25) {
            System.out.println("You can drink!");
        }

        if (name.equalsIgnoreCase("Raymond")) {
            System.out.println("I love potatoes!");
        } else {
            System.out.println("I don't love potatoes");
        }
    }
}
