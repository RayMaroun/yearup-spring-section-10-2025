package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Rectangle 1:");
        System.out.println("Enter the length of the rectangle:");
        int length1 = scanner.nextInt();

        System.out.println("Enter the width of the rectangle:");
        int width1 = scanner.nextInt();

/*        int area1 = length1 * width1;
        int perimeter1 = 2 * (length1 + width1);

        System.out.println("The length is: " + length1);
        System.out.println("The width is: " + width1);
        System.out.println("The area is: " + area1);
        System.out.println("The perimeter is: " + perimeter1);*/

        calculateRectangleInfo(length1, width1);

        System.out.println("-----------------------------------------------");
        System.out.println("Rectangle 2:");
        System.out.println("Enter the length of the rectangle:");
        int length2 = scanner.nextInt();

        System.out.println("Enter the width of the rectangle:");
        int width2 = scanner.nextInt();

/*        int area2 = length2 * width2;
        int perimeter2 = 2 * (length2 + width2);

        System.out.println("The length is: " + length2);
        System.out.println("The width is: " + width2);
        System.out.println("The area is: " + area2);
        System.out.println("The perimeter is: " + perimeter2);*/
        calculateRectangleInfo(length2, width2);

        System.out.println("-----------------------------------------------");
        System.out.println("Rectangle 3:");
        System.out.println("Enter the length of the rectangle:");
        int length3 = scanner.nextInt();

        System.out.println("Enter the width of the rectangle:");
        int width3 = scanner.nextInt();

/*        int area3 = length3 * width3;
        int perimeter3 = 2 * (length3 + width3);

        System.out.println("The length is: " + length3);
        System.out.println("The width is: " + width3);
        System.out.println("The area is: " + area3);
        System.out.println("The perimeter is: " + perimeter3);*/
        calculateRectangleInfo(length3, width3);

    }

    public static void calculateRectangleInfo(int length, int width) {
        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }


}
