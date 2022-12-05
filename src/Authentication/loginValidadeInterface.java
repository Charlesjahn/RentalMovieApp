/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public interface loginValidadeInterface {

    /**
     *
     * @param password
     * @param realPassword
     * @return true is param match
     */
    public boolean passwordValidade(String password, String realPassword);

    /**
     *
     * @param password
     * @param realPassword
     * @return true is param match
     */
    public boolean userValidade(String password, String realPassword);

    /**
     *
     * @param un user name
     * @param up user password
     * @return true if un and up are true
     */
    public boolean loginValidate(String un,String up );
}
