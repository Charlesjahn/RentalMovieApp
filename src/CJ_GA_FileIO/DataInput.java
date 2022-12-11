/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJ_GA_FileIO;

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
    public List<String> InputData(String InputFile) throws FileNotFoundException, IOException {
        BufferedReader myReader = new BufferedReader(new FileReader(InputFile));
        List<String> lines = new ArrayList<>();
        String inputLine = myReader.readLine();
        System.out.println(inputLine);
        while ((inputLine = myReader.readLine()) != null) {
            lines.add(inputLine);
        }     
        return lines;
    }
}
