package com.sharma.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEmployeeExample {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Abc", 1, "Bangalore"),
                new Employee("mnp", 2, "Delhi"),
                new Employee("Axyz", 3, "US"),
                new Employee("Sweta", 4, "Rusia"),
                new Employee("Rajesh", 5, "Japan"),
                new Employee("Manoj", 6, "Delhi")
        );
        //In this case Comparator interface is not required to implemented by Employee class
        // In sort method we have provided implementation for compare
        //     i.e ---> Stream<T> sorted(Comparator<? super T> comparator)
        List<Employee> sortedListOfEmp = empList.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());

        System.out.println("Sorted Emp List");
        System.out.println(sortedListOfEmp);

        System.out.println("Sorted Emp List by Salary");


        //In this case Comparator interface is used to implemented by Employee class
        List<Employee> sortedEmpBySalary = empList.parallelStream()
                .sorted(new EmployeeCustomSorting())
                .collect(Collectors.toList());
        System.out.println(sortedEmpBySalary);

        // Note : Below is the wromg Implementation .
        // when there is sorting on multiple filrs then we have to use
        //  sorted(sortByName.thenComparing()) Custom sorting on two attribute
        //
        System.out.println("Sorted Emp List by Salary and name");
        List<Employee> wrongImplementationForSorting =
                empList.parallelStream()
                        .sorted( (o1, o2) -> o1.getName().compareTo(o2.getName()))
                        .sorted(new EmployeeCustomSorting())
                        .collect( Collectors.toList());
        System.out.println(wrongImplementationForSorting);



        System.out.println("New Implementation Sorted Emp List by Salary and name");
        Comparator<Employee> sortByName  =  (e1,e2)-> e1.getName().compareTo(e2.getName());
        List<Employee> sortedEmpBySalaryandName =
                empList.parallelStream()
                        .sorted(sortByName.thenComparing(
                                (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                        )
                        .collect( Collectors.toList());
        System.out.println(sortedEmpBySalaryandName);

    }
}

class EmployeeCustomSorting implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (e1.getSalary() - e2.getSalary());
    }
}

