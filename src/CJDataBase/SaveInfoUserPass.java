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
 * @author Charles Franklin Jahn
 */
public class SaveInfoUserPass {

    public void insertInfoUserPass(String userName, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            boolean testingUser = stmt.execute(
                    String.format("INSERT IGNORE INTO %s (username, password) "
                            + "VALUES (\"%s\", \"%s\") ;",
                            tableName, userName, userPass)
            );
            if (testingUser) {
                System.out.println("Valid User!");
            } else {
                System.out.println("Invalid!!!\n Please try a different User Name:");
            }

        } catch (SQLException e) {
            System.out.println("invalid user");
            e.printStackTrace();
        }
    }
}
