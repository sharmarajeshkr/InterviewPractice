package com.sharma.innerClass.methodLocalInnerClass;

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // No return type
        outer.addValues();

        // Use-Case want to hide Implement, But not using interface or abstract class
        int values = outer.multiply(5,6);
        System.out.println(values);

    }
}
