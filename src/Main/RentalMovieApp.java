package Main;

import CJDataBase.DatabaseMainProcessor;
import java.io.IOException;
import java.util.Scanner;
import CJFileIO.CSVProcessor;
import CJMenuLoginSign.LoopingMenuLoginSignValidation;
import GAFile.SavingMovieTable;

/**
 *
 * @author Charles Franklin Jahn 2020315
 * @Author Gabriel Antoniolli - Movie Database
 */
public class RentalMovieApp {

//    /**
//     * @param args the command line arguments
//     * @throws java.io.IOException
//     * @throws java.lang.ClassNotFoundException
//     * @throws java.lang.InstantiationException
//     * @throws java.lang.IllegalAccessException
//     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Scanner myKB = new Scanner(System.in);
        boolean userValidateLogin = false;
        int menuOption = 0;
        DatabaseMainProcessor databaseCreating = new DatabaseMainProcessor();
        databaseCreating.setTableName("UserPasswor");
        databaseCreating.DatabaseCreating();

//        SavingMovieTable databaseCreatingTableMove = new SavingMovieTable();
//        databaseCreating.setTableName("movies");
//        databaseCreating.DatabaseCreating();
//        databaseCreatingTableMove.loadMovieTable();
        /*
        * Here will Show the menu to login, Sign or Exir
        * While not insert valid input it will keep looping
        * This while will loop until be break with one of the option
         */
        while (menuOption == 0) {
            LoopingMenuLoginSignValidation loopMenuLoginSignVariable = new LoopingMenuLoginSignValidation();
            menuOption = loopMenuLoginSignVariable.loopMenuLoginSignValidation(menuOption);

            switch (menuOption) {
                case 1 -> {
                    System.out.println("User name: ");
                    String userName = myKB.nextLine();
                    System.out.println("Password: ");
                    String userPassword = myKB.nextLine();
                    if (!userValidateLogin) {
                        if (databaseCreating.searchInfo(userName, userPassword)) {
                            userValidateLogin = true;
                        } else {
                            menuOption = 0;
                            System.out.println(menuOption);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("User name: ");
                    String userName = myKB.nextLine();
                    System.out.println("Password: ");
                    String userPassword = myKB.nextLine();
                    databaseCreating.saveInfo(userName, userPassword);
                    menuOption = 0;
                }
                case 3 -> {
                }
            }
        }
        /*
        * If user is valid it here will be the menu for rent movies
         */
        if (userValidateLogin) {
            CSVProcessor csvProcessor = new CSVProcessor();
            csvProcessor.processCSV();
        }
    }

}
