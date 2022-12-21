package Main;

import CJDataBase.DatabaseMainProcessor;
import java.io.IOException;
import CJMenuLoginSign.LoopingMenuLoginSignValidation;
import CJMenuLoginSign.MenuLoginSing;
import CJMenuLoginSign.UserNamePassword;
import GAFile.MovieDisplay;
import GADataBase.QueryMoviesDB;
import GADataBase.SavingMovieTable;
import GAFile.FindMovie;
import GAFile.UserMovieOptionsOrganizer;
import LAdbRentedMovies.DBRentedMovies;
import LAuserMenu.UserMenu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                    UserNamePassword userInfoIniti = new UserNamePassword();
                    userInfoIniti.askInfo();
                    if (!userValidateLogin) {
                        if (databaseCreating.searchInfo(userInfoIniti.getUserEmail(), userInfoIniti.getUserPassword())) {
                            userValidateLogin = true;
                        } else {
                            menuOption = 0;
                        }
                    }
                }
                case 2 -> {
                    UserNamePassword userInfoIniti = new UserNamePassword();
                    userInfoIniti.askInfo();
                    databaseCreating.saveInfo(userInfoIniti.getUserEmail(), userInfoIniti.getUserPassword());
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
//            List to store rented Movies
            List<MovieDisplay> movies = new ArrayList<MovieDisplay>();
            int temp = 0;
            DBRentedMovies rented = new DBRentedMovies(movies);
//            loop to keep displaying menu 
            while (temp != 3) {
                UserMenu option = new UserMenu();
                option.userMenuDecoretor();
                int choice = option.userMenu();

                //switch logic 
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
                            movies = movieQuery.getMovieDisplayLine();

                            // sets this variable to true so it wont reload the db if another user logs in
                            moviesLoaded = true;

//                            loop to choose movie 
                            for (MovieDisplay md : movies) {

                                System.out.println(md);
                                System.out.println("Choose a Movie id:");

                            }
//                          scanner to get user input
                            Scanner userInput = new Scanner(System.in);
                            int rentMovie = userInput.nextInt();
                            FindMovie findMovieId = new FindMovie(rentMovie, movies);
                            MovieDisplay selectedMovie = findMovieId.getMovieForRent();
                            rented.addMovie(selectedMovie);
                            UserNamePassword userInfoIniti = new UserNamePassword();
                            userInfoIniti.askInfo();
//                            output user input for test purpose 
                            System.out.println("The movie: " + selectedMovie.getTitle() + " was rented by: " + userInfoIniti.getUserEmail() + " Costing 5 euros");
//                            comeback to choice
                            option.userMenuDecoretor();
                        }

//          break;
                    }
//                    second case, to see rented movies
                    case 2 -> {

                        rented.showMoviesRented();
                        break;
                    }
//                    third case, exit program
                    case 3 -> {
                        System.out.println("Thank you for using our app");
                        break;
                    }

                }
            }
        }
    }
}
