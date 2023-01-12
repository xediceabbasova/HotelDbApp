package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public class AbstractDao {

    public Connection connect() throws Exception {

        String url = "jdbc:mysql://localhost:3306/hotel";
        String name = "root";
        String password = "12345";

        Connection c = DriverManager.getConnection(url, name, password);
        return c;
    }

}
