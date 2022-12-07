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

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String dbName = "users_passwords";
        String DB_URL = "jdbc:mysql://localhost/" + dbName;
        String USER = "CA1movieApp";
        String PASS = "CA1movieApp";
        String tableName = "UserPasswor";
        DatabaseUsersPasswords userPassDB = new DatabaseUsersPasswords();
        userPassDB.dataBaseConn(dbName, USER, PASS, tableName);
    }
}
