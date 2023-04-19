package com.sharma.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEmployeeExample {
    public static void main(String[] args) {
       List<Employee> empList =
        Arrays.asList(
                new Employee("Abc",1247903,"Bangalore"),
                new Employee("mnp",944444,"Delhi"),
                new Employee("Axyz",999999,"US"),
                new Employee("Sweta",999999,"Rusia"),
                new Employee("Rajesh",99999944,"Japan"),
                new Employee("Manoj",55555,"Delhi")
        );
       List<Employee> sortedListOfEmp =
       empList.stream()
               .sorted(
                       (o1,o2) -> o1.getName().compareTo(o2.getName())
               ).collect(
                       Collectors.toList()
       );

        System.out.println("Sorted Emp List");
        System.out.println(sortedListOfEmp);

        System.out.println("Sorted Emp List by Salary");


        List<Employee> sortedEmpBySalary =
                empList.parallelStream()
                        .sorted(new EmployeeCustomSorting())
                        .collect(
                                Collectors.toList()
                        );


        System.out.println(sortedEmpBySalary);

        System.out.println("Sorted Emp List by Salary and name");
        List<Employee> sortedEmpBySalaryandName =
        empList.parallelStream()
                .sorted(new EmployeeCustomSorting())
                .sorted(
                        (o1,o2) -> o1.getName().compareTo(o2.getName())
                )
                .collect(
                        Collectors.toList()
                );


        System.out.println(sortedEmpBySalaryandName);


    }
}

class EmployeeCustomSorting implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return (e1.getSalary() - e2.getSalary());
    }
}

