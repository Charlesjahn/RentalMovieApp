
package rentalmovieapp;

import java.io.IOException;

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
        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processCSV();
    }
    
}
