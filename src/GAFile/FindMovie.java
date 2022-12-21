/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAFile;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class FindMovie {
    
    
    private int movieId;
    private ArrayList<MovieDisplay> movies;
    
    public FindMovie(int movieID,   ArrayList<MovieDisplay> movies){
    
        this.movieId = movieID;
        this.movies = movies;
    }
    
    
    public MovieDisplay getMovieForRent(){
    
    
        return movies.get(movieId);
    }
}
