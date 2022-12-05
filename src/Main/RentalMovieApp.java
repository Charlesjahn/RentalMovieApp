package Main;

import Authentication.Login;
import Authentication.loginValidadeInterface;
import Menu.MenuLoginSing;
import Menu.MenuLoginSingInterface;
import java.io.IOException;
import java.util.Scanner;
import rentalmovieapp.CSVProcessor;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class RentalMovieApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner myKB = new Scanner(System.in);
        MenuLoginSing loginSignOption = new MenuLoginSing();
        loginValidadeInterface loginValidate = new Login();
        
        while(!loginSignOption.MenuLoginSing()){
        }
        
        String userName = "null";
        String userPassword = "null";
        while (!loginValidate.loginValidate(userName, userPassword)) {
            System.out.println("User name: ");
            userName = myKB.nextLine();
            System.out.println("Password: ");
            userPassword = myKB.nextLine();

        }

        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processCSV();
    }
}
