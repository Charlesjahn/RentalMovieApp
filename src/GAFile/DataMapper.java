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
 * @Author Gabriel Antoniolli 
 */
public class DataMapper {
    
    ArrayList<Integer> movieID = new ArrayList<>();
    ArrayList<String> original_title = new ArrayList<>();
    ArrayList<String> release_date = new ArrayList<>();
    ArrayList<String> runtime = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> original_language = new ArrayList<>();
    
    public MovieRecords map(List<String> lines){
    
        DataSplitter splitter = new DataSplitter();
        
        for(String s : lines){
          String[] currLine =   splitter.splitData(s);
          int newID = Integer.parseInt(currLine[0]);
          movieID.add(newID);
          original_title.add(currLine[1]);
          release_date.add(currLine[2]);
          runtime.add(currLine[3]);
          title.add(currLine[4]);
          original_language.add(currLine[5]);
        }
       
        MovieRecords records = new MovieRecords(movieID,original_title, release_date, runtime, title, original_language);
        
        return records;
    }
}
