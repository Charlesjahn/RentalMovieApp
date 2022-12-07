/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author charl
 */
public class DatabaseUsersPasswords {

    public void dataBaseConn(String dbName, String USER, String PASS, String tableName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName +";");
            stmt.execute("USE " + dbName + ";");
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                            + "userName VARCHAR(30) NOT NULL,"
                            + "id INT NOT NULL PRIMARY KEY,"
                            + "password TEXT(15));"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
