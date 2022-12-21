
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAFile;

/**
 *
 * @author gabri
 */
public class MovieDisplay {
    
    final int movieID;
    private final String title;
    private final String runtime;
    private final String original_language;

    public MovieDisplay(int movieID, String title, String runtime, String original_language) {
        this.movieID = movieID;
        this.title = title;
        this.runtime = runtime;
        this.original_language = original_language;
    }

    public MovieDisplay() {
        
    }

    public String getID(){
    
        return ("" +this.movieID + "");
    }
    
    public String getTitle() {
        return title;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getOriginal_language() {
        return original_language;
    }

    @Override
    public String toString() {
        return "" + movieID + "_ " + title + ", runtime=" + runtime + ", original_language=" + original_language + '}';
    }
    
    
    
}
