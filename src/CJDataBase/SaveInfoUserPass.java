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
public class SaveInfoUserPass {

    public void insertInfoUserPass(String userName, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute(
                    String.format("INSERT INTO %s (username, password) "
                            + "VALUES (\"%s\", \"%s\") ;",
                            tableName, userName, userPass)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
