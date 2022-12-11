/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJDataBase;

/**
 *
 * @author charl
 */
public class DatabaseMainProcessor {

    private final DatabaseTableCreatingUserPass createTable = new DatabaseTableCreatingUserPass();
    private final DataBaseInfoUserPass dbInfo = new DataBaseInfoUserPass();
    private final SaveInfoUserPass saveInfo = new SaveInfoUserPass();
    private final String dbName = "users_passwords";
    private final String DB_URL = "jdbc:mysql://localhost/" + dbName;
    private final String USER = "CA1movieApp";
    private final String PASS = "CA1movieApp";
    private String tableName;

    public void DatabaseCreating() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if ("UserPasswor".equals(tableName)) {
            createTable.dataBaseConnUser(dbName, USER, PASS, tableName);
        } else if ("movies".equals(tableName)) {
            createTable.dataBaseConnMovie(dbName, USER, PASS, tableName);
        }

    }

    public boolean saveInfo(String userName, String userPass) {
        saveInfo.insertInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }

    public boolean searchInfo(String userName, String userPass) {
        dbInfo.DBInfoUserPass(userName, userPass, DB_URL, USER, PASS, tableName);
        return true;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
