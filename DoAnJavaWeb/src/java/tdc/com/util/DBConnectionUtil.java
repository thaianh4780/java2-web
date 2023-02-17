/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBConnectionUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/shopsach";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public static Connection openConnection() {
        if (connection != null) {
            return connection;
        } else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }

    public static void main(String[] args) {
        System.out.println(DBConnectionUtil.openConnection());
    }

}
