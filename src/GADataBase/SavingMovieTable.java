/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GADataBase;

import CJFileIO.CSVProcessor;
import GAFile.MovieRecords;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @Author Gabriel Antoniolli - Movie Database
 */
public class SavingMovieTable {

    private final CSVProcessor processor = new CSVProcessor();
    private final FillingMovieTable loader = new FillingMovieTable();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "CA1movieApp";
    private final String PASS = "CA1movieApp";
    private final String tableName = "movies";

    public QueryMoviesDB loadMovieTable() throws IOException {
        MovieRecords records = processor.processCSV();
        ArrayList<Integer> movieID = records.getAllList().get(0);
        ArrayList<String> original_title = records.getAllList().get(1);
        ArrayList<String> release_date = records.getAllList().get(2);
        ArrayList<String> runtime = records.getAllList().get(3);
        ArrayList<String> title = records.getAllList().get(4);
        ArrayList<String> original_language = records.getAllList().get(5);

        for (int i = 0; i < movieID.size(); i++) {
//            System.out.println(movieID.get(i) + original_title.get(i) + release_date.get(i) + runtime.get(i) + title.get(i) + original_language.get(i));
            loader.load(movieID.get(i), original_title.get(i), release_date.get(i), runtime.get(i), title.get(i), original_language.get(i), DB_URL, USER, PASS, tableName);
        }
        return new QueryMoviesDB(USER, PASS, DB_URL);
    }
}
