/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJFileIO;

import GAFile.DataMapper;
import GAFile.MovieRecords;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class CSVProcessor {
    /**
     * Parse the CSV
     * 
     * @return
     * @throws IOException 
     */
    public MovieRecords processCSV() throws IOException {
        System.out.println("LOADING...");
        String inputFile = "movies-test2.csv";
        DataInput dataInput = new DataInput();
        List<String> lines = dataInput.InputData(inputFile);
        
        DataMapper map = new DataMapper();
        MovieRecords records = map.map(lines);
        
        return records;
    }
}
