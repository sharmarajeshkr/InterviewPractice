package com.sharma.com.design.facade;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbTypes, ReportTypes types, String tableName) {
        Connection connection = null;
        switch (dbTypes) {

            case MYSQL:
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (types) {
                    case PDF -> mySqlHelper.generateMySqlPDFReport(tableName, connection);
                    case HTML -> mySqlHelper.generateMySqlHTMLReport(tableName, connection);
                }
            case ORACLE:
                connection = OracleHelper.getOracleDBConnection();
                MySqlHelper OracleHelper = new MySqlHelper();
                switch (types) {
                    case PDF -> OracleHelper.generateMySqlPDFReport(tableName, connection);
                    case HTML -> OracleHelper.generateMySqlHTMLReport(tableName, connection);
                }
        }


    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}
