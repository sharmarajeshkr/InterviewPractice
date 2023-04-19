package com.sharma.practice.equalandhashcode;

import java.util.HashMap;

public class AppCode {
    public static void main(String[] args) {
        HashMap<Employee,String> emp = new HashMap<Employee,String>();
        Employee e1 = new Employee(1,"ABC");
        Employee e2 = new Employee(2,"MNP");
        Employee e3 = new Employee(3,"ABC");

        emp.put(e1,"Test1");
        emp.put(e2,"Test2");
        emp.put(e3,"Test3");

        System.out.println(emp);
        // With or without hashcode and equals
        // {Employee{id=3, name='ABC'}=Test3, Employee{id=1, name='ABC'}=Test1, Employee{id=2, name='MNP'}=Test2}


    }
}
