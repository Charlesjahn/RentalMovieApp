/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJFileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class DataInput {
    
    /**
     * Load the File with the info of all movie
     * 
     * @param InputFile
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public List<String> InputData(String InputFile) throws FileNotFoundException, IOException {
        BufferedReader myReader = new BufferedReader(new FileReader(InputFile));
        List<String> lines = new ArrayList<>();
        String inputLine = myReader.readLine();
        while ((inputLine = myReader.readLine()) != null) {
            lines.add(inputLine);
        }     
        return lines;
    }
}
