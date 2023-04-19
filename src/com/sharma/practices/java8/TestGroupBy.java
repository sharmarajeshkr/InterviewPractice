package com.sharma.practices.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupBy {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        Map<Student, String> map = new HashMap<>();
        Student a = new Student("Math", "Michael", "Peterson", "New York", 20);
        Student b = new Student("Math", "James", "Robertson", "Miami", 20);
        map.put(a, "A");
        map.put(b, "c");
        System.out.println(map.size());


        Map<String, Long> studentsBySubject = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getSubject, Collectors.counting()
                ));
        System.out.println(studentsBySubject);

    }
}
