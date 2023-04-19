package com.sharma.practices.java8.customMultiGroup;


public class Employee {

    private int id;
    private String name;
    private GroupBy groupBy;
    private long salary;

    public Employee(int id, String name, long salary, GroupBy groupBy) {
        super();
        this.id = id;
        this.name = name;
        this.groupBy = groupBy;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", groupBy=" + groupBy + "]";
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }
}

