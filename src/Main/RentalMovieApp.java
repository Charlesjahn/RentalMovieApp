package Main;

import CJDataBase.DatabaseMainProcessor;
import java.io.IOException;
import CJMenuLoginSign.LoopingMenuLoginSignValidation;
import CJMenuLoginSign.MenuLoginSing;
import CJMenuLoginSign.UserNamePassword;
import GAFile.MovieDisplay;
import GADataBase.QueryMoviesDB;
import GADataBase.SavingMovieTable;
import GAFile.UserMovieOptionsOrganizer;
import LAuserMenu.UserMenu;
import java.util.List;

/**
 *
 * @author Charles Franklin Jahn 2020315
 * @author Gabriel Antoniolli - Movie Database
 * @author Luiza Cavalcanti 2020309 - User Menu
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

        UserNamePassword userInfoIniti = new UserNamePassword();
        boolean userValidateLogin = false;
        boolean moviesLoaded = false;
        int menuOption = 0;
        DatabaseMainProcessor databaseCreating = new DatabaseMainProcessor();
        databaseCreating.setTableName("UserPassword");
        databaseCreating.DatabaseCreating();

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
                    userInfoIniti.askInfo();
                    if (!userValidateLogin) {
                        if (databaseCreating.searchInfo(userInfoIniti.getUserName(), userInfoIniti.getUserPassword())) {
                            userValidateLogin = true;
                        } else {
                            menuOption = 0;
                        }
                    }
                }
                case 2 -> {
                    userInfoIniti.askInfo();
                    databaseCreating.saveInfo(userInfoIniti.getUserName(), userInfoIniti.getUserPassword());
                    menuOption = 0;
                }
                case 3 -> {
                }
            }
        }
        /**
         * If user is valid it here will be the menu for rent movies
         */
        if (userValidateLogin) {
            UserMenu option = new UserMenu();
            option.userMenuDecoretor();
            int choice = option.userMenu();

            //Logic
            switch (choice) {

                case 1 -> {
                    if (moviesLoaded == false) {
                        // will create the movies table if it hasnt been created before
                        databaseCreating.setTableName("movies");
                        databaseCreating.DatabaseCreating();

                        //Start filling the table with the data read from the .csv file
                        SavingMovieTable movieTable = new SavingMovieTable();

                        // start retrieving the data from the db to a variable called movies
                        QueryMoviesDB movieQuery = movieTable.loadMovieTable();
                        movieQuery.GetAllMovies();

                        // movies has the title, runtime, and original_language properties to each movie
//                        List<MovieDisplay> movies = movieQuery.getMovieDisplayLine();
//
//                        // sets this variable to true so it wont reload the db if another user logs in
//                        moviesLoaded = true;
//
//                        UserMovieOptionsOrganizer movieOrganizer = new UserMovieOptionsOrganizer(movies);
//                        movieOrganizer.displayMovies();
//                        System.out.println("Rent a movie, by choosing it's number");
                    }
//                  LAReadDBMovies readMovie = new LAReadDBMovies();
//                  readMovie.load();
                }
                case 2 ->
                    System.out.println("working on 2");
                case 3 ->
                    System.out.println("working on 3");
                case 4 -> {
                    System.out.println("Back to main menu!");
                    MenuLoginSing back = new MenuLoginSing();
                    back.MenuLoginSing();
                    break;
                }
//                default:
//                userChoice = "Option not valid, Please choose one of the above";
            }
        }
    }
}
