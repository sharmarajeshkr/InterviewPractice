package com.sharma.Immutable;

public class AppImmutable {
    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        StudentImmutable student = new StudentImmutable(1, "Alex", age);
        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        student.getAge().setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }
}
