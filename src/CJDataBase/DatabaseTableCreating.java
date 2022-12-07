/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author charl
 */
public class DatabaseTableCreating {

    public void dataBaseConn(String dbName, String USER, String PASS, String tableName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
            stmt.execute("USE " + dbName + ";");
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "idUser INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                    + "userName VARCHAR(30) NOT NULL,"
                    + "password TEXT(15) NOT NULL);"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
