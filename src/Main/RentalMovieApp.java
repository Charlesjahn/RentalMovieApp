package Main;

import DataBase.DatabaseMainProcessor;
import CJAuthentication.Login;
import CJAuthentication.loginValidadeInterface;
import java.io.IOException;
import java.util.Scanner;
import CJ_GA_FileIO.CSVProcessor;
import CJMenuLoginSign.LoopingMenuLoginSignValidation;

/**
 *
 * @author Charles Franklin Jahn 2020315
 */
public class RentalMovieApp {

//    /**
//     * @param args the command line arguments
//     * @throws java.io.IOException
//     * @throws java.lang.ClassNotFoundException
//     * @throws java.lang.InstantiationException
//     * @throws java.lang.IllegalAccessException
//     */
//    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Scanner myKB = new Scanner(System.in);
//        loginValidadeInterface loginValidate = new Login();
//        boolean userValidateLogin = false;
//        int menuOption = 0;
//        DatabaseMainProcessor databaseCreating = new DatabaseMainProcessor();
//        databaseCreating.DatabaseCreating();
////        databaseCreating.saveInfo("admin", "admin");
//        databaseCreating.searchInfo("admin", "admin");
//        /*
//        * Here will Show the menu to login, Sign or Exir
//        * While not insert valid input it will keep looping
//        * This while will loop until be break with one of the option
//         */
//        while (menuOption == 0) {
//            LoopingMenuLoginSignValidation loopMenuLoginSignVariable = new LoopingMenuLoginSignValidation();
//            menuOption = loopMenuLoginSignVariable.loopMenuLoginSignValidation(menuOption);
//
//            switch (menuOption) {
//                case 1:
//                    System.out.println("User name: ");
//                    String userName = myKB.nextLine();
//                    System.out.println(userName);
//                    System.out.println("Password: ");
//                    String userPassword = myKB.nextLine();
//                    System.out.println(userPassword);
//                    if (!userValidateLogin) {
//                        if (!loginValidate.loginValidate(userName, userPassword)) {
//                            menuOption = 0;
//                        }
//                    }
//                    System.out.println(menuOption);
//                    break;
//                case 2:
//                    System.out.println("Under contrustion");
//                    menuOption = 0;
//                    break;
//                case 3:
//                    break;
//            }
//        }
//        /*
//        * If user is valid it here will be the menu for rent movies
//         */
//        if (userValidateLogin) {
//            CSVProcessor csvProcessor = new CSVProcessor();
//            csvProcessor.processCSV();
//        }
//    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    
        DatabaseMainProcessor databaseCreating = new DatabaseMainProcessor();
        databaseCreating.DatabaseCreating();
        databaseCreating.loadMovieTable();
    }

}
