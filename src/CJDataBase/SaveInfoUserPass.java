/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Charles Franklin Jahn
 */
public class SaveInfoUserPass {

    public void insertInfoUserPass(String userName, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {
            boolean newUserName = true;
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName + " WHERE userName = '" + userName + "';");
            while (rs.next()) {
                System.out.println("User Name already exist!!");
                newUserName = false;
                break;
            }
            if (newUserName) {
                stmt.execute(
                        String.format("INSERT IGNORE INTO %s (username, password) "
                                + "VALUES (\"%s\", \"%s\") ;",
                                tableName, userName, userPass)
                );
            }
        } catch (SQLException e) {
            System.out.println("Database not Connected 4");
        }
    }
}
