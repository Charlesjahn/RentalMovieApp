/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAFile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class UserMovieOptionsOrganizer {
    
    List<MovieDisplay> movies;
    
    public UserMovieOptionsOrganizer(List<MovieDisplay> movies){
        this.movies = movies;
    }
    public void displayMovies(){
        
        List<MovieDisplay> temp = new ArrayList<MovieDisplay>();
    
        for(int i = 0; i < 10; i++){
        
            System.out.println(movies.get(i));
            temp.add(movies.get(i));
            movies.remove(i);
            
        
        }
        for(MovieDisplay md : temp){
        
            movies.add(md);
            temp.remove(md);
        }
        
        
    
    }
    
}
