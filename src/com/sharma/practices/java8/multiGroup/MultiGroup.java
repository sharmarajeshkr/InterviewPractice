package com.sharma.practices.java8.multiGroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiGroup {
    public static void main(String[] args) {
        // Creating List and adding Employees values.
        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));

        // Group By Destination and return List of Employee
        Map<String,List<Employee>> data =
        employeesList.stream()
                .collect( Collectors.groupingBy( Employee::getDesignation));

        System.out.println(data);

        // Example 2
        // group by - multiple fields
        // Grouping by designation and Gender two properties and need to get the count.

        Map<String, Map<String, List<Employee>>> multipleFieldsMapList =

                employeesList.stream()
                        .collect(Collectors.groupingBy(Employee::getDesignation,
                                Collectors.groupingBy(Employee::getGender)
                        ));
        System.out.println(multipleFieldsMapList);

        // group by - multiple fields
        // Grouping by designation and Gender two properties and need to get the count.


        Map<String, Map<String, Long>> multipleFieldsMap =

                employeesList.stream()
                        .filter(emp -> emp.getGender().equals("Female"))
                        .collect(Collectors.groupingBy(Employee::getDesignation,
                                Collectors.groupingBy(Employee::getGender,
                                        Collectors.counting())));

        System.out.println(multipleFieldsMap);


    }
}
