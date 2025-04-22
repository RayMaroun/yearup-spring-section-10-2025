package com.pluralsight;

public class Main3 {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue"};
        String[] copy = new String[3];

        // copy = colors; Wrong

        System.arraycopy(colors, 0, copy, 0, 3);


        colors[1] = "black";

        System.out.println("Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("=============================================");

        System.out.println("Copy:");
        for (String copyElement : copy) {
            System.out.println(copyElement);
        }
        System.out.println("=============================================");
    }
}
