package com.h2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by thinkpad on 2016/7/17.
 */
public class TestConnection {
    public static void main(String[] args) throws SQLException {
        H2Manager h2Manager = H2Manager.getBean();
        Connection connection = h2Manager.getConnnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM INFORMATION_SCHEMA.CATALOGS ");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

    }
}
