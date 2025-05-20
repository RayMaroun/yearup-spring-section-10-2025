package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // filter
        System.out.println("Filter Method");
        System.out.println();

        List<String> titles = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

/*        List<String> matching = titles
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .collect(Collectors.toList());

        matching.forEach(matchingTitle -> System.out.println(matchingTitle));*/

        titles
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .collect(Collectors.toList())
                .forEach(matchingTitle -> System.out.println(matchingTitle));

        System.out.println("==========================================================================");

        // count
        System.out.println("Count Method");
        System.out.println();

        List<String> titles2 = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        long count = titles2
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .count();

        System.out.println("The count is: " + count);

        System.out.println("==========================================================================");
        // forEach()

        System.out.println("forEach Method");
        System.out.println();

        List<String> titles3 = Arrays.asList(
                "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");

        titles3
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .toList()
                .forEach(System.out::println);

        System.out.println("==========================================================================");
        // sorted()

        System.out.println("Sorted Method");
        System.out.println();

        List<String> titles4 = Arrays.asList(
                "Halloween 3", "Ghost", "Halloween ",
                "Friday the 13th", "Twister", "Halloween 2");

        titles4
                .stream().filter(title -> title.toLowerCase().contains("halloween"))
                .sorted() // in reverse order: .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
