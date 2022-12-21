/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class CheckEmailFormat {

    public boolean emailFormatcheck(String email) {
        if (!email.contains("@cct.ie")) {
            System.out.println("Your email must be 'exemple'@cct.ie");
            return false;
        } else {
            return true;
        }
    }
}
