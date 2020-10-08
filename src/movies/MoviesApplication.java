package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");

        Input input = new Input();

        int userNumber = input.getInt();

        if(userNumber == 1){
            for (Movie movie:MoviesArray.findAll() ) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }else if(userNumber == 2){
           printMoviesByCategory("animated");
        }else if(userNumber == 3){
           printMoviesByCategory("drama");
        } else if(userNumber == 4){
            printMoviesByCategory("horror");
        } else if(userNumber == 5){
           printMoviesByCategory("scifi");
        } else {
            System.exit(0);
        }
    }

    public static void printMoviesByCategory(String category){
        for(Movie movie: MoviesArray.findAll()){
            if(movie.getMovieCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }
    }
}
