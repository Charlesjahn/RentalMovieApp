/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GADataBase;

/**
 *
 * @author gabri
 */
public class MovieDisplay {
    
    String title;
    String runtime;
    String original_language;

    public MovieDisplay(String title, String runtime, String original_language) {
        this.title = title;
        this.runtime = runtime;
        this.original_language = original_language;
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
    
    
    
}
