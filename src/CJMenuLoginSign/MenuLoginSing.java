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
public class MenuLoginSing {

    private int option;
    private final Scanner myKB = new Scanner(System.in);
    
    // It show only the option
    public void MenuLoginSingDecorador() {
        System.out.println("1: Login");
        System.out.println("2: Sign");
        System.out.println("3: Exit");
    }
    // Test if what was typed is a int number
    public boolean MenuLoginSing() {
        try {
            int num = myKB.nextInt();
            this.option = num;
            return true;
        } catch (Exception e) {
            myKB.nextLine(); //clean the variable input
            return false;
        }
    }

    public int getOption() {
        return option;
    }
}
