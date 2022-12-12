package CJDataBase;

import CJMenuLoginSign.UserPasswordValidation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Charles Franklin Jahn
 */
public class DataBaseInfoUserPass {

    private final UserPasswordValidation check = new UserPasswordValidation();
    private String name;
    private int idUser;
    private String passwordUser;
//AND password = '" + userPass + "'

    public boolean DBInfoUserPass(String userName, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName + " WHERE userName = '" + userName + "' ;");
            while (rs.next()) {
                this.name = rs.getString("userName");
                this.idUser = rs.getInt("idUser");
                this.passwordUser = rs.getString("password");
                if (!check.validstionInfoDB(userName, this.name)) {
                    System.out.println("User invalid");
                    break;
                }
                if (!check.validstionInfoDB(userPass, this.passwordUser)) {
                    System.out.println("Password invalid");
                    break;
                } else {
                    return true;
                }
            }
        } catch (SQLException e) {
            return false;
        }
        System.out.println("User invalid");
        return false;
    }

    public String getName() {
        return name;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

}
