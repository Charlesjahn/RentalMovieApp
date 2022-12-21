/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAuserMenu;

import java.util.Scanner;

/**
 *
 * @author luizaalbuquerque
 */
public class LAuserMenu {

    public int userMenu() {

        int userChoice;

        Scanner userInput = new Scanner(System.in);

        System.out.println("User Menu");
        System.out.println("1: Rent a movie");
        System.out.println("2: See rented movies");
        System.out.println("3: Exit user menu");
        System.out.println("Choose an option above:");
        userChoice = userInput.nextInt();

        return userChoice;
    }

}
