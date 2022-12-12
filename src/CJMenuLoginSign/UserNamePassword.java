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

    private String userName;
    private String userPassword;

    public void askInfo() {
        System.out.println("User name: ");
        this.userName = myKB.nextLine().trim();
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
