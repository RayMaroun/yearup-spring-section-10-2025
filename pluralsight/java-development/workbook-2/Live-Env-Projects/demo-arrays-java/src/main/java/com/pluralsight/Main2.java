package com.pluralsight;

import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        String[] nameList = {
                "Natalie", "Brittany", "Zachary", "Ezra", "Ian", "Siddalee", "Elisha", "Pursalane", "Zephaniah"
        };

        for (int i = 0; i < nameList.length; i++) {
            System.out.println(nameList[i]);
        }

        System.out.println("=======================================================");

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("=======================================================");

        Arrays.sort(nameList);

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("=======================================================");

        Arrays.sort(nameList, Collections.reverseOrder());

        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
