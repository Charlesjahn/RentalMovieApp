/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAdbRentedMovies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luizaalbuquerque
 */
public class LAdbRentedMovies {

    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "CA1movieApp";
    private final String PASS = "CA1movieApp";
    private String tableName = "UserPasswor";

    public void addMovie() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT * from " + tableName + " WHERE userName = '" + userName + "' ;");

        } catch (SQLException e) {
        }
    }
}