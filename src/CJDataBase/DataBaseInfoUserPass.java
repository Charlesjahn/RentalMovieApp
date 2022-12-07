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
 * @author charl
 */
public class DataBaseInfoUserPass {

    private String name;
    private int idUser;
    private String passwordUser;

    public boolean DBInfoUserPass(String DB_URL, String USER, String PASS, String tableName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName + ";");
            while (rs.next()) {
                this.name = rs.getString("userName");
                this.idUser = rs.getInt("idUser");
                this.passwordUser = rs.getString("password");
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

}
