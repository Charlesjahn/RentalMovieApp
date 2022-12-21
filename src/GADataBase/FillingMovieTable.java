/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GADataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @Author Gabriel Antoniolli - Movie Database
 */
public class FillingMovieTable {

    public void load(int id, String originalTitle, String releaseDate, String runtime, String title, String originalLanguage, String DB_URL, String USER, String PASS, String tableName) {

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users_passwords.movies;");

            while (rs.next()) {
                String sql = "INSERT INTO movies (id, original_title, release_date, runtime, title, original_language) "
                        + "VALUES (?,?,?,?,?,?);";

                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setInt(1, id);
                preparedStmt.setString(2, originalTitle);
                preparedStmt.setString(3, releaseDate);
                preparedStmt.setString(4, runtime);
                preparedStmt.setString(5, title);
                preparedStmt.setString(6, originalLanguage);
                preparedStmt.execute();
                conn.close();
            }
        } catch (SQLException e) {
        }
    }

}
