package com.sharma.com.design.designPattern.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Sharma");
        empList.add("Raj");
        empList.add("Ravi");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

       @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String emp : this.getEmpList())
            temp.add(emp);

        return new Employees(temp);
    }

}