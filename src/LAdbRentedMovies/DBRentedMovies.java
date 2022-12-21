/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAdbRentedMovies;

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
 * @author luizaalbuquerque
 */
public class DBRentedMovies {

//    creating list of rented movies
    List<MovieDisplay> movies;

    public DBRentedMovies(List<MovieDisplay> movies) {
        this.movies = movies;

    }

//    Method to add rented movies to list 
    public void addMovie(MovieDisplay movieRented) {

        movies.add(movieRented);

    }
//  Method to show rented movies to user 
    public void showMoviesRented() {

//        in case, th list is empty (= 0), output message to user that there isn't any movies to rent  
        if (movies.size() == 0) {
            System.out.println("not movies were rented yet");
        }
//        loop to output rented movies list 
        for (MovieDisplay md : movies) {
            System.out.println(md);
        }

    }
}
