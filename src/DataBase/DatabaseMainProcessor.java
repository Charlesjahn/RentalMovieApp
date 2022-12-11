/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import CJ_GA_FileIO.CSVProcessor;
import CJ_GA_FileIO.MovieRecords;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author charl
 * @Author Gabriel Antoniolli - Movie Database
 */
public class DatabaseMainProcessor {

    private final DatabaseTableCreating createTable = new DatabaseTableCreating();
    private final DataBaseInfoUserPass dbInfo = new DataBaseInfoUserPass();
    private final CJSaveInfoUserPass saveInfo = new CJSaveInfoUserPass();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
//    private final String USER = "CA1movieApp";
//    private final String PASS = "CA1movieApp";
    private final String USER = "test";
    private final String PASS = "";
    private final String tableName = "UserPasswor";

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        createTable.dataBaseConn(dbName, USER, PASS, tableName);

    }

    public boolean saveInfo(String userName, String userPass) {
        saveInfo.insertInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }

    public boolean searchInfo(String userName, String userPass) {
        dbInfo.DBInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }
    public void loadMovieTable() throws IOException{
       LoadMovieTable loader = new LoadMovieTable();
        CSVProcessor processor = new CSVProcessor();
        MovieRecords records = processor.processCSV();
        ArrayList<Integer> movieID = records.getAllList().get(0);
        ArrayList<String> original_title = records.getAllList().get(1);
        ArrayList<String> release_date = records.getAllList().get(2);
        ArrayList<String> runtime = records.getAllList().get(3);
        ArrayList<String> title = records.getAllList().get(4);
        ArrayList<String> original_language = records.getAllList().get(5);
       
        for(int i = 0; i < movieID.size(); i++){
        
                loader.load(movieID.get(i), original_title.get(i), release_date.get(i), runtime.get(i), title.get(i), original_language.get(i), DB_URL, USER, PASS, "movies");
        }
        
    
        
    }
}
