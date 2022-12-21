/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GADataBase;

import GAFile.MovieDisplay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class QueryMoviesDB {
    
    ArrayList<MovieDisplay> movies = new ArrayList<MovieDisplay>();
    
    private final String USER;
    private final String PASS;
    private final String DB_URL;

    public QueryMoviesDB(String USER, String PASS, String DB_URL) {
        this.USER = USER;
        this.PASS = PASS;
        this.DB_URL = DB_URL;
        
    }
    
     public void GetAllMovies() {
        try {
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users_passwords.movies;");
            while (rs.next()) {
                
                movies.add(new MovieDisplay(rs.getInt("id"), rs.getString("title"), rs.getString("runtime"), rs.getString("original_language")));
            }
        } catch (SQLException e) {
            System.out.println("Any error has occurrend when loading this file: InfoMoviesDB");
        }
    }

    public List<MovieDisplay> getMovieDisplayLine(){
        
        return movies;
    }
    
}
