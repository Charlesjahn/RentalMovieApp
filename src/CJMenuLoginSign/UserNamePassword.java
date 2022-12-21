/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

import java.util.Scanner;

/**
 *
 * @author charl
 */
public class UserNamePassword {

    private final Scanner myKB = new Scanner(System.in);
    private final CheckEmailFormat emailFormart = new CheckEmailFormat();
    private String userName;
    private String userPassword;
    private boolean emailIsfine = false;

    public void askInfo() {
        while (!this.emailIsfine) {
            System.out.println("User Email: ");
            if (emailFormart.emailFormatcheck(myKB.nextLine().trim())) {
                emailIsfine = true;
            }
        }

        System.out.println("Password: ");
        this.userPassword = myKB.nextLine().trim();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
