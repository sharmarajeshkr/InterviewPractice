package com.sharma.practices.java8.addprifixAndSuffix;

import com.sharma.practices.java8.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Person {
    private Integer id;
    private String fname;
    private String lname;
}

public class A {
    public static void main(String[] args) {
            iterateList();
        // addPrifixSuffix();
        //repeatedCharacter();
        // nonRepeatedCharacter();
        // List<Student> removeDuplicatePersons = removeDuplicatePersons();
        // List<Character> characters = removeDuplicateChracters();
        // List<Integer> list = removeDuplliacte();
        //randomNumbers();
    }


    // How to check if list is empty in Java 8 using Optional,
    // if not null iterate through the list and print the object
    static void iterateList() {

        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Math", "John", "Smith", "Miami", 9),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        String studentNames =
                Optional.ofNullable(students)
                        .orElseGet(Collections::emptyList)
                        .stream()
                        .filter(Objects::nonNull)
                        .map(student -> student.getName())
                        .collect(Collectors.toSet()).stream().sorted(Collections.reverseOrder())
                        .collect(Collectors.joining("-"));
        System.out.println(studentNames);

    }
    

    static void repeatedCharacter() {
        String input = "Java Hungry Blog Alive is Awesome";
        input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                ).entrySet()
                .stream()
                .filter(count -> count.getValue() > 1)
                .map(obj -> obj.getKey())
                .forEach(
                        val -> System.out.println(val)
                );

        ;
    }


    static void nonRepeatedCharacter() {
        String input = "Java Hungry Blog Alive is Awesome";
        Map<Character, Long> map =
                input.chars()  // IntStream
                        .mapToObj(c -> Character.valueOf((char) c))
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        ));
        System.out.println(map);
        List<Character> chars =
                map.entrySet()
                        .stream()
                        .filter(ent -> ent.getValue() == 1)
                        .map(obj -> obj.getKey())
                        .collect(Collectors.toList());
        // this will return all Non-repeated chars
        System.out.println(chars);

        // Find first char
        Character ch = chars.stream().findFirst().get();
        System.out.println(ch);
    }


    static List<Student> removeDuplicatePersons() {
        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Math", "John", "Smith", "Miami", 9),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        return students.stream()
                .filter(distinctByKey(student -> student.getName() + student.getSurname()))
                .collect(Collectors.toList());


    }

    static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    static List<Character> removeDuplicateChracters() {
        String s = "java";
        return s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());


    }


    static List<Integer> removeDuplliacte() {
        return Arrays.asList(1, 2, 3, 4, 1, 2, 3)
                .stream()
                .collect(Collectors.toSet())
                .stream().collect(Collectors.toList());
    }

    static void addArrays() {
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> integerList2 = Arrays.asList(5, 6, 7);
        Stream stream = Stream.concat(integerList1.stream(), integerList2.stream());
        stream.forEach(val -> System.out.println(val));
    }

    static void addNumbers() {
        IntStream.range(1, 10).map(num -> 3 * num).forEach(System.out::println);
    }

    static void printNumbers() {
        IntStream.range(1, 10).forEach(System.out::println);
    }

    static void iterateString() {
        Stream.of("A", "B", "M", "r", "C")
                .forEach(System.out::println);

        ;
    }

    static void countLength() {
        // String Length greater than 3
        List<String> stringList = Arrays.asList("Hello", "Interview", "Questions", "Answers", "Ram", "for");
        stringList.stream().filter(
                str -> str.length() > 3
        ).collect(
                Collectors.toList()
        ).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }

    static void getMinimum() {
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .min(Comparator.comparing(Integer::valueOf))
                .get();


        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();


    }

    static void randomNumbers() {
        new Random().ints().limit(10).forEach(System.out::println);
    }

    static void addPrifixSuffix() {
        StringJoiner stringJoiner = new StringJoiner(",", "#", "--");
        stringJoiner.add("pawan");
        stringJoiner.add("Rajesh");
        System.out.println(stringJoiner);
    }
}
