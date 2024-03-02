package com.sharma.designPattern.structural.Facade;


/*
   Facade design pattern is used to help client applications to easily interact with the system.

    Example
        The Facade defines a unified, higher level interface to a subsystem that makes it easier to use.
        Consumers encounter a Facade when ordering from a catalog.
        The consumer calls one number and speaks with a customer service representative.

        The customer service representative acts as a Facade, providing an interface(way) to
            The order Department,   The Billing department, and The shipping department.

    Example :
        Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of reports,
        such as HTML report, PDF report etc.

        So we will have different set of interfaces to work with different types of database.
        Now a client application can use these interfaces to get the required database connection and generate reports.


 */
public class FacadeClientCode {
    public static void main(String[] args) {
        // Client Required HTML Report using Oracle DB On Table Employee
        String tableName = "Employees";

        FacadeDesignPattern facadeDesignPattern = new FacadeDesignPattern();
        facadeDesignPattern.generateReport(DBTypes.ORACLE,ReportType.HTML,tableName);





    }
}
