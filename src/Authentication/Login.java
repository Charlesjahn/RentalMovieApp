/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Authentication;


/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class Login implements loginValidadeInterface {
        
    @Override
    public boolean passwordValidade(String password, String realPassword) {
        return password.equals(realPassword);
    }
    @Override
    public boolean userValidade(String user, String realUser) {
        return user.equals(realUser);
    }
    
    @Override
    public boolean loginValidate(String un,String up) {
        return passwordValidade(un,"admin") && userValidade(up, "admin");
    }
}
