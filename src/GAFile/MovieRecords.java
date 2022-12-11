/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAFile;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @Author Gabriel Antoniolli - Movie Database
 */
public class MovieRecords {
    
     ArrayList<Integer> id;
     ArrayList<String> original_title;
     ArrayList<String> release_date;
     ArrayList<String> runtime;
     ArrayList<String> title;
     ArrayList<String> original_language;

    public MovieRecords(ArrayList<Integer> id, ArrayList<String> original_title, ArrayList<String> release_date, ArrayList<String> runtime, ArrayList<String> title, ArrayList<String> original_language) {
        this.id = id;
        this.original_title = original_title;
        this.release_date = release_date;
        this.runtime = runtime;
        this.title = title;
        this.original_language = original_language;
    }
    
    
    public HashMap<Integer,ArrayList> getAllList(){
    
        HashMap<Integer,ArrayList> map = new HashMap<Integer,ArrayList>();
        map.put(0, id);
        map.put(1, original_title);
        map.put(2, release_date);
        map.put(3, runtime);
        map.put(4, title);
        map.put(5, original_language);
        
        return map;
    }
    
    
    
}
