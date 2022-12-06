package Main;

import CJAuthentication.Login;
import CJAuthentication.loginValidadeInterface;
import CJMenu.MenuLoginSing;
import java.io.IOException;
import java.util.Scanner;
import CJFileIO.CSVProcessor;
import java.awt.BorderLayout;

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
        loginValidadeInterface loginValidate = new Login();

        /*Here will Show the menu to login or Sign
        * While not insert valid input it will keep looping
         */
        boolean userValidateLogin = false;
        int menuOption = 0;
        menuOption = loopMenuLoginSign(menuOption);

        switch (menuOption) {
            case 1:
                String userName = "null";
                String userPassword = "null";
                if (!userValidateLogin) {
                    System.out.println("User name: ");
                    userName = myKB.nextLine();
                    System.out.println("Password: ");
                    userPassword = myKB.nextLine();
                    if (!loginValidate.loginValidate(userName, userPassword)) {
                        menuOption = loopMenuLoginSign(0);
                    }
                }
                break;
            case 2:
                System.out.println("Under contrustion");
            case 3:
                break;
        }
        if (userValidateLogin) {
            CSVProcessor csvProcessor = new CSVProcessor();
            csvProcessor.processCSV();
        }
    }

    public static int loopMenuLoginSign(int n) {
        MenuLoginSing loginSignOption = new MenuLoginSing();
        while (!loginSignOption.optionValid(n)) {
            while (!loginSignOption.MenuLoginSing()) {
            }
            n = loginSignOption.getOption();
        }
        return loginSignOption.getOption();
    }
}
