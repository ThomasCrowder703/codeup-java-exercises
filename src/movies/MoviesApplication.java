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


        if(input.getInt() == 1){
            for (Movie movie:MoviesArray.findAll() ) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }


    }
}
