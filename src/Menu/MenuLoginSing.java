/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author charl
 */
public class MenuLoginSing{

    private int option;
    private Scanner myKB = new Scanner(System.in);

    public boolean MenuLoginSing() {
        System.out.println("1: Login");
        System.out.println("2: Sign");
        option = myKB.nextInt();

        while (!isValid(option)) {
            setOption(myKB.nextInt());
            return true;
        }
        return false;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public boolean isValid(int x) {
        try {
            return true;
        } catch (Exception e) {
            System.out.println("NOT int");
            return false;
        }
    }

}
