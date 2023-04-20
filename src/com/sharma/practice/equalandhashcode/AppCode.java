package com.sharma.practice.equalandhashcode;

import java.util.HashMap;
import java.util.Objects;

public class AppCode {
    public static void main(String[] args) {
        HashMap<EmployeeTest, String> emp = new HashMap<EmployeeTest, String>();
        EmployeeTest e1 = new EmployeeTest(1, "ABC");
        EmployeeTest e2 = new EmployeeTest(2, "MNP");
        EmployeeTest e3 = new EmployeeTest(3, "ABC");

        emp.put(e1, "Test1");
        emp.put(e2, "Test2");
        emp.put(e3, "Test3");
        System.out.println(emp);
        System.out.println(emp.size());
    }
}

class EmployeeTest {
    private int id;
    private String name;

    public EmployeeTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // provide implementation for hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeTest that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
