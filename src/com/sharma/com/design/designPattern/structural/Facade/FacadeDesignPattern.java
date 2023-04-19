package com.sharma.com.design.designPattern.structural.Facade;

import java.sql.Connection;

/*
    Facade Design Pattern is one of the Structural design patterns (such as Adapter pattern and Decorator pattern).
    Facade design pattern is used to help client applications to easily interact with the system.

    Example
        The Facade defines a unified, higher level interface to a subsystem that makes it easier to use.
        Consumers encounter a Facade when ordering from a catalog.
        The consumer calls one number and speaks with a customer service representative.

        The customer service representative acts as a Facade, providing an interface(way) to
            The order fulfillment department,   The billing department, and The shipping department.

    Example :
        Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of reports,
        such as HTML report, PDF report etc.

        So we will have different set of interfaces to work with different types of database.
        Now a client application can use these interfaces to get the required database connection and generate reports.


 */





// Facade class that will interact with other subclass(helper) class. To get report as the user as from respective DB.
public class FacadeDesignPattern {

    public void generateReport(DBTypes dbType, ReportType reportType, String tableName){
        Connection conn = null;
        switch (dbType){
            case MYSQL:
                conn = MySQLHelper.getSQLDBConnection();
                MySQLHelper sqlHelper = new MySQLHelper();
                switch (reportType){
                    case PDF: sqlHelper.generateSQLPDFReport(conn,tableName);   break;
                    case HTML: sqlHelper.generateSQLHTMLReport(conn,tableName); break;
                }
                break;
            case ORACLE:
                conn = MyOracleHelper.getSQLDBConnection();
                MyOracleHelper oracleHelper = new MyOracleHelper();
                switch (reportType){
                    case HTML: oracleHelper.generateSQLHTMLReport(conn,tableName); break;
                    case PDF: oracleHelper.generateSQLPDFReport(conn,tableName); break;
                }
                break;

        }

    }
}

//Different Types of Database available
enum DBTypes{
    MYSQL,ORACLE
}
// Different  Types of Report available
enum ReportType{
    PDF,HTML
}

// MYSQL Class Helper class
class MySQLHelper{
    // Get Connection from MySQL DB
    public static Connection getSQLDBConnection(){
        //
        return null;
    }

    public void generateSQLPDFReport(Connection conn,String table){
        //Get the connection and Generate PDF Report based on the table name
        System.out.println("PDF Report using Mysql on table "+table);
    }

    public void generateSQLHTMLReport(Connection conn,String table){
        //Get the connection and Generate HTML Report based on the table name
        System.out.println("HTML Report using Mysql on table "+table);
    }
}

// My Oracle Helper
class MyOracleHelper{
    // Get Connection from MySQL DB
    public static Connection getSQLDBConnection(){
        //
        return null;
    }

    public void generateSQLPDFReport(Connection conn,String table){
        //Get the connection and Generate PDF Report based on the table name
        System.out.println("PDF Report using Oracle on table "+table);
    }

    public void generateSQLHTMLReport(Connection conn,String table){
        //Get the connection and Generate HTML Report based on the table name
        System.out.println("HTML Report using Oracle on table "+table);
    }
}

