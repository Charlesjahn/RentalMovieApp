/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

/**
 *
 * @author charl
 */
public class CheckEmailFormat {

    public boolean emailFormatcheck(String email) {
        if (email.contains("@cct.ie")) {
            System.out.println(email);
            return true;

        } else {
            System.out.println("Your email must be 'exemple'@cct.ie");
            System.out.println(email);
            return false;
        }

    }
}
