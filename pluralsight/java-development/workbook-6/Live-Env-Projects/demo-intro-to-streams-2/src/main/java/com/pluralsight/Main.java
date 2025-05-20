package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Emanuel", "Galloway", 30));
        employees.add(new Employee("Ray", "Maroun", 55));
        employees.add(new Employee("Adam", "Jessie", 25));

        System.out.println("Enter a last name to search: ");
        Scanner scanner = new Scanner(System.in);
        String lastNameToSearch = scanner.nextLine();

/*        List<Employee> matchingEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(lastNameToSearch)) {
                matchingEmployees.add(employee);
            }
        }*/

/*        List<Employee> matchingEmployees =
                employees // Source - Data at Rest
                        .stream().filter(employee -> employee.getLastName().equalsIgnoreCase(lastNameToSearch)) // Data Transformation - Data is in Transit
                        .collect(Collectors.toList()); // Destination - Data at Rest*/


        ArrayList<Employee> matchingEmployees =
                employees // Source - Data at Rest
                        .stream().filter(employee -> employee.getLastName().equalsIgnoreCase(lastNameToSearch)) // Data Transformation - Data is in Transit
                        .collect(Collectors.toCollection(ArrayList::new)); // Destination - Data at Rest




        System.out.println("The results are: ");

/*        for (Employee matchingEmployee : matchingEmployees) {
            System.out.println(matchingEmployee);
        }*/

        matchingEmployees.forEach(matchingEmployee -> System.out.println(matchingEmployee));

        employees.forEach(emp -> {
            if (emp.getAge() < 40)
                System.out.println(emp.getFirstName() + " is young.");
            else
                System.out.println(emp.getLastName() + " is experienced.");
        });
    }
}
