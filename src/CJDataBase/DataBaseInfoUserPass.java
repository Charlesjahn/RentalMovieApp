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
    private String email;
    private int idUser;
    private String passwordUser;

    public boolean DBInfoUserPass(String userEmail, String userPass, String DB_URL, String USER, String PASS, String tableName) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from " + tableName + " WHERE userEmail = '" + userEmail + "' ;");
            while (rs.next()) {
                this.email = rs.getString("userEmail");
                this.idUser = rs.getInt("idUser");
                this.passwordUser = rs.getString("password");
                if (!check.validstionInfoDB(userEmail, this.email)) {
                    System.out.println("User Email invalid");
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
                        System.out.println("Database not Connected 2");

            return false;
        }
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
