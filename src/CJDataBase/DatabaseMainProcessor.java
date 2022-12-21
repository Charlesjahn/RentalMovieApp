/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJDataBase;

import GADataBase.DatabaseTableCreatingMovies;

/**
 *
 * @author Charles Franklin Jahn
 */
public class DatabaseMainProcessor {

    private final DatabaseTableCreatingUserPass createTable = new DatabaseTableCreatingUserPass();
    private final DatabaseTableCreatingMovies createMovieTable = new DatabaseTableCreatingMovies();
    private final DataBaseInfoUserPass dbInfo = new DataBaseInfoUserPass();
    private final SaveInfoUserPass saveInfo = new SaveInfoUserPass();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "CA1movieApp";
    private final String PASS = "CA1movieApp";
    private String tableName;

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if ("UserPassword".equals(tableName)) {
            createTable.dataBaseConnUser(dbName, USER, PASS, tableName);
        } else if ("movies".equals(tableName)) {
            createMovieTable.dataBaseConnMovies(dbName, USER, PASS, tableName);
        }
    }

    public boolean saveInfo(String userEmail, String userPass) {
        saveInfo.insertInfoUserPass(userEmail, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }

    public boolean searchInfo(String userEmail, String userPass) {
        return dbInfo.DBInfoUserPass(userEmail, userPass, DB_URL, USER, PASS, tableName);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
