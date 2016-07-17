package com.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by thinkpad on 2016/7/17.
 */
public class H2Manager {
    private Connection connection;
    private String user = "sa";
    private String pwd = "";
    private String url = "jdbc:h2:~/test";
    private String driver = "org.h2.Driver";
    private static H2Manager h2Manager;

    public static H2Manager getBean() {
        if (null == h2Manager) {
            h2Manager = new H2Manager();
        }
        return h2Manager;
    }

    public Connection getConnnection() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
