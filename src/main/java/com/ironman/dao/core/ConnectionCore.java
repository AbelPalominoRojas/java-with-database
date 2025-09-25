package com.ironman.dao.core;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnectionCore {
    public Connection getConnection() throws Exception {
        // Attributes
        String host = "localhost";
        String port = "1433";
        String database = "DB_BookLoanSystem";
        String username = "developer";
        String password = "D3v#123457";

        // Load Driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // URL connection string
        String url = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + database + ";encrypt=true;trustServerCertificate=true;";

        // Return connection
        return DriverManager.getConnection(url, username, password);
    }
}
