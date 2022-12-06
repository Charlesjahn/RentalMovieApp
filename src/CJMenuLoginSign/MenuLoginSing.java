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
    private Scanner myKB = new Scanner(System.in);

    public boolean MenuLoginSing() {
        System.out.println("1: Login");
        System.out.println("2: Sign");
        System.out.println("3: Exit");
        try {
            int num = myKB.nextInt();
            setOption(num);
            return true;
        } catch (Exception e) {
            myKB.nextLine();
            return false;
        }
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }
    
    public boolean optionValid(int num){
        return num == 1 || num == 2 || num == 3;
    }
    
}
