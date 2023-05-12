package org.sid.generateabs.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // static because no change on this database
    private static Connection connection = null;
    public static Connection getConnection() throws SQLException {
        if(connection!= null)
        {
            return connection;
        }
        else{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/myDataBase?useSSL=false";
            String user ="root";
            String password="";
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
