package com;

import com.orientechnologies.orient.jdbc.OrientJdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by user on 05.08.2016.
 */
public class Test3 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "root");

        Class.forName("com.orientechnologies.orient.jdbc.OrientJdbcDriver");
        Connection conn = (OrientJdbcConnection) DriverManager.getConnection("jdbc:orient:remote:localhost/123", info);
    }
}
