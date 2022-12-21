/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAFile;

import java.util.List;

/**
 *
 * @author gabri
 */
public class FindMovie {
    
    
    private final int movieID;
    private final List<MovieDisplay> movies;
    
    public FindMovie(int movieID, List<MovieDisplay> movies){
    
        this.movieID = movieID;
        this.movies = movies;
    }
    
    
    public MovieDisplay getMovieForRent(){
    
    for(MovieDisplay md : movies){
    
        if(md.movieID == movieID){
        
            return md;
        } 
    }
        return null;
    }
}
