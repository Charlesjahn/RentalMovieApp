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

    private boolean newUserName = true;

    /**
     * This method will save the user name and password on database
     *
     * @param userEmail
     * @param userPass
     * @param DB_URL
     * @param USER
     * @param PASS
     * @param tableName
     */
    public void insertInfoUserPass(String userEmail, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName + " WHERE userEmail = '" + userEmail + "';");
            while (rs.next()) {
                System.out.println("User Email already exist!!");
                this.newUserName = false;
                break;
            }
            if (this.newUserName) {
                stmt.execute(
                        String.format("INSERT IGNORE INTO %s (userEmail, password) "
                                + "VALUES (\"%s\", \"%s\") ;",
                                tableName, userEmail, userPass)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error in saving the user name and/or password!");
        }
    }
}
