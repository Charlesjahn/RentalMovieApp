/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

import java.util.Scanner;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class UserNamePassword {

    private final Scanner myKB = new Scanner(System.in);
    private final CheckEmailFormat emailFormart = new CheckEmailFormat();
    private String userEmail;
    private String userPassword;
    private boolean emailIsfine = false;

    public void askInfo() {
        while (!this.emailIsfine) {
            System.out.println("User Email: 'exemple'@cct.ie");
            String userEmailTest = myKB.nextLine().trim();
            if (emailFormart.emailFormatcheck(userEmailTest)) {
                this.userEmail = userEmailTest;
                this.emailIsfine = true;

            } else {
                this.userEmail = "";
            }
        }
        System.out.println("Password: ");
        this.userPassword = myKB.nextLine().trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
