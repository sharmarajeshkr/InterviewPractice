package com.design.solid.dependency_injection_principal.services;

import com.design.solid.dependency_injection_principal.pojo.DatabaseConfig;

import java.sql.Connection;

public interface DataSource {
    void createConnection(DatabaseConfig config);
    Connection getConnection();

}