/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GADataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @Author Gabriel Antoniolli - Movie Database
 */
public class DatabaseTableCreatingMovies {
    public void dataBaseConnMovies(String dbName, String USER, String PASS, String tableName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
            stmt.execute("USE " + dbName + ";");
            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS movies ("
                    + "id INT NOT NULL PRIMARY KEY,"
                    + "original_title VARCHAR(45) NOT NULL,"
                    + "release_date VARCHAR(30) NOT NULL,"
                    + "runtime VARCHAR(30) NOT NULL,"
                    + "title VARCHAR(45) NOT NULL,"
                    + "original_language VARCHAR(5) NOT NULL);"
                    
            );
        } catch (SQLException e) {
            System.out.println("Error of creating the table!");
        }

    }
}
