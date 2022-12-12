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
    private final DatabaseTableCreatingMovies moviesTable = new DatabaseTableCreatingMovies();
    private final DataBaseInfoUserPass dbInfo = new DataBaseInfoUserPass();
    private final SaveInfoUserPass saveInfo = new SaveInfoUserPass();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "test";
    private final String PASS = "";
    private String tableName;

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if ("UserPasswor".equals(tableName)) {
            createTable.dataBaseConnUser(dbName, USER, PASS, tableName);
        } else if ("movies".equals(tableName)) {
            moviesTable.dataBaseConnMovies(dbName, USER, PASS, tableName);
        }
    }

    public boolean saveInfo(String userName, String userPass) {
        saveInfo.insertInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }

    public boolean searchInfo(String userName, String userPass) {
        return dbInfo.DBInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
