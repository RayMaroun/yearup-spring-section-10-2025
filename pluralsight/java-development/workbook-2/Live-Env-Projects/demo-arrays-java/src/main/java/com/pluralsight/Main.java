package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 1;
        int[] newArrayOfNumbers = new int[5]; // empty array

        int[] listOfNumbers = {63, 123, 234, 32, 564, 23, 64};


        for (int i = 0; i < newArrayOfNumbers.length; i++) {
            System.out.print(newArrayOfNumbers[i] + " ");
        }

        System.out.println();
        System.out.println("==========================================");

        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.print(listOfNumbers[i] + " ");
        }

/*        int i = 0;

        while (i < listOfNumbers.length) {
            System.out.println(listOfNumbers[i]);
            i++;
        }*/
        System.out.println();
        System.out.println("==========================================");

        newArrayOfNumbers[2] = 15;

        for (int i = 0; i < newArrayOfNumbers.length; i++) {
            System.out.print(newArrayOfNumbers[i] + " ");
        }

        System.out.println();
        System.out.println("==========================================");

        boolean[] boolArray = new boolean[4];

        for (int i = 0; i < boolArray.length; i++) {
            System.out.print(boolArray[i] + " ");
        }

        System.out.println();
        System.out.println("==========================================");

        boolArray[1] = true;

        for (int i = 0; i < boolArray.length; i++) {
            System.out.print(boolArray[i] + " ");
        }
        System.out.println();

        System.out.println("==========================================");
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        displayNumbers(nums);

        System.out.println("==========================================");
        int[] arrayFromMethod = getNumbers();
        displayNumbers(arrayFromMethod);

    }

    public static void displayNumbers(int[] listOfNumbers) {
        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.print(listOfNumbers[i] + " ");
        }
        System.out.println();
    }

    public static int[] getNumbers() {
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        return nums;
    }

}
