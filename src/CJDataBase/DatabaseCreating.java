/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJDataBase;

/**
 *
 * @author charl
 */
public class DatabaseCreating {

    private final DataBaseInfoUserPass dbInfo = new DataBaseInfoUserPass();
    private final CJSaveInfoUserPass saveInfo = new CJSaveInfoUserPass();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "CA1movieApp";
    private final String PASS = "CA1movieApp";
    private final String tableName = "UserPasswor";

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        DatabaseUsersPasswords userPassDB = new DatabaseUsersPasswords();
        userPassDB.dataBaseConn(dbName, USER, PASS, tableName);
        dbInfo.DBInfoUserPass(DB_URL, USER, PASS, tableName);

    }
    public boolean saveInfo(String userName, String userPass){
        saveInfo.insertInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }
}
