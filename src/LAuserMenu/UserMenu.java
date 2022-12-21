/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAuserMenu;

import java.util.Scanner;

/**
 *
 * @author Luiza Albuquerque
 */
public class UserMenu {

    private int userChoice;
    
//    Method to get user input from menu
    public int userMenu() {
        Scanner userInput = new Scanner(System.in);
        this.userChoice = userInput.nextInt();
        return userChoice;
    }

//    Method to output movies menu to user
    public void userMenuDecoretor() {
        System.out.println("\nUser Menu");
        System.out.println("1: Rent a movie");
        System.out.println("2: See rented movies");
        System.out.println("3: Exit");
    }

}
